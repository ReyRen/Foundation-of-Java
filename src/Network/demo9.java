package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by reyren on 2017/2/9.
 */
//接收端
public class demo9 {
    public static void main(String[] args) throws IOException, InterruptedException {
        DatagramSocket datagramSocket = new DatagramSocket(9090);

        byte[] buf = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

        //不断接收
        while(true){
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(buf, 0, datagramPacket.getLength()));
            Thread.sleep(1000);
        }
    }
}
