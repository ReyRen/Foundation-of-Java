package TCPIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by reyren on 2/20/17.
 */
//Tcp-Client
public class TCPC {

    public static void main(String[] args) throws IOException {

        //Establish the TCP client
        Socket socket = new Socket(InetAddress.getByName("192.168.1.194"),9090);

        //get the OutputStream objects from Socket
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        //get the InputStream objects from Socket
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //get the keyboard Stream
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

        //input message from the keyboard
        String line = null;
        while ((line = keyReader.readLine()) != null){
            outputStreamWriter.write(line + "\r\n");
            //refresh, in order to put the stream out the buffer area
            outputStreamWriter.flush();
            //read the message from Server socket
            line = socketReader.readLine();
            System.out.println("the response message from the server is ：" + line);
        }
        socket.close();
    }
}
