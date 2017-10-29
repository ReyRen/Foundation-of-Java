package TCPIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by reyren on 2/20/17.
 */
//UDP-server

public class UDPS {
    public static void main(String[] args) throws IOException{

        //establish the UDP client
        DatagramSocket datagramSocket = new DatagramSocket(9090);

        //A null buf used to store the data
        byte[] buf = new byte[1024];
        //using the data package store the buf
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

        datagramSocket.receive(datagramPacket);
        System.out.println("the server received: " + new String(buf,0,datagramPacket.getLength()));

        datagramSocket.close();
    }
}
