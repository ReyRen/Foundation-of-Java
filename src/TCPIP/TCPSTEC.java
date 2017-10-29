package TCPIP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2/20/17.
 */
//TCP-Server
public class TCPSTEC {
    public static void main(String[] args) throws IOException {
        ServerSocket sock =  new ServerSocket(9090);
        Socket newsock = sock.accept();
        DataInputStream inp = new DataInputStream(newsock.getInputStream());
        PrintStream outp = new PrintStream(newsock.getOutputStream());

        outp.println("Hello :: enter Quit to exit");
        boolean more_data = true;
        while (more_data){
            String line = inp.readLine();
            if (line == null){
                more_data = false;
            }else {
                outp.println("From Server:" + line + "\n");
                if (line.trim().equals("Quit")){
                    more_data = false;
                }
            }
            newsock.close();
        }
    }
}
