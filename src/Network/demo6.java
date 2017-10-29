package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by reyren on 2017/2/9.
 */
/*
*
* */
//群聊接收端
public class demo6 extends Thread{
    @Override
    public void run() {
        try {
            //建立UDP服务

            DatagramSocket datagramSocket = new DatagramSocket(9090);
            //准备空的数据包存储数据
            byte[] buf = new byte[2014];
            DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
            boolean flag = true;
            while (flag){
                datagramSocket.receive(datagramPacket);
                //datagramPacket.getAddress()获取对方IP数据包的对象
                System.out.println(datagramPacket.getAddress().getHostAddress() + "说" + new String(buf, 0, datagramPacket.getLength()));
            }
            datagramSocket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


    }
}
