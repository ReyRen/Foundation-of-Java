package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by reyren on 2017/2/8.
 *
 * 原因：
 *  每个网络程序都有自己特定的数据格式，如果接受到的不符合指定的格式就会当成垃圾数据丢弃(相当于数据加密)
 *
 * 在UDP协议中，有一个IP地址称为广播地址，广播地址是主机号为255的地址，在同一个网络段内的机器都能接受到信息
 */
//给QQ发消息

public class demo4 {
    public static void main(String[] args) throws IOException {
        //建立UDP服务
        DatagramSocket datagramSocket = new DatagramSocket();
        //准备数据，把数据封装到数据包中
        String data = "QQ, 你好";
        DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.1.194"),53097);
        //发送数据
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
