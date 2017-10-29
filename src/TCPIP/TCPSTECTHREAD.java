package TCPIP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2/20/17.
 */
//TCP-server-Thread
public class TCPSTECTHREAD extends Thread {
    public static void main(String[] args) {

        int nreq = 1;
        try {
            ServerSocket sock = new ServerSocket(9090);
            for (;;){
                Socket newsock = sock.accept();
                System.out.println("Creating thread...");
                Thread t = new ThreadHandler(newsock,nreq);
                t.start();
                nreq++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class ThreadHandler extends Thread {
    Socket newsock;
    int n;

    ThreadHandler(Socket s, int v) {
        newsock = s;
        n = v;
    }

    public void run() {
        try {
            DataInputStream inp = new DataInputStream(newsock.getInputStream());
            PrintStream outp = new PrintStream(newsock.getOutputStream());
            outp.println("Hello, enter Quite to exist");
            boolean more_data = true;
            while (more_data) {
                String line = inp.readLine();
                if (line == null) {
                    more_data = false;
                } else {
                    outp.println("From Server :" + line + "\n");
                    if (line.trim().equals("Quite")) {
                        more_data = false;
                    }
                }
                newsock.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}