package TCPIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by reyren on 2/20/17.
 */
//UDP-client
public class UDPC {
    public static void main(String[] args) throws IOException {

        //establish the UDP client
        DatagramSocket datagramSocket = new DatagramSocket();

        //put the message into the data package
        String data = "hel UDP server, I am the UDP client";

        //establish a data package
        DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.1.194"),9090);

        //send the data package using the UDP socket
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
