package TCPIP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2/20/17.
 */
//Server-TCP
public class TCPS {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9090);//establish the TCP server and the port num is 9090

        Socket socket = serverSocket.accept();//connect with the client socket

        //get the InputStream objects from the client's socket
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //get the OutputStream objects the client's socket
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        //get the InputStream objects from the keyboard
        BufferedReader keyReader =  new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while((line = bufferedReader.readLine()) != null){
            System.out.println("The server get the message from the clinet : " + line);
            System.out.println("Please input the response message : ");
            line = keyReader.readLine();
            outputStreamWriter.write(line + "\r\n");
            outputStreamWriter.flush();
        }
        serverSocket.close();
    }
}
