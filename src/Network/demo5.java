package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by reyren on 2017/2/9.
 */
/*
*
* */
//群聊发送端
public class demo5 extends Thread {
    @Override
    public void run() {
        try {
            //建立UDP的服务
            DatagramSocket datagramSocket = null;

            datagramSocket = new DatagramSocket();

            //准备数据，把数据封装到数据包中
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//一行一行的读
            DatagramPacket datagramPacket = null;
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.1.255"), 9090);
                //把数据包发送出去

                datagramSocket.send(datagramPacket);


            }

            //关闭资源
            datagramSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

    }
}
