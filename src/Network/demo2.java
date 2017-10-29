package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by reyren on 2017/2/8.
 */
/*在java中网络通讯称为Socket()通讯，要求通讯的两台机器必须安装Scoket
不同的协议有这不同的Scoket

UDP下的Socket

    DatagramSocketUDP插座服务
    DatagramPacket数据包类
*       buf:发送的数据内容
*       length:发送数据内容的大小
*       address:发送的目的IP地址对象
*       port:端口号
* 发送端使用步骤：
*   1.
* */
//发送端
public class demo2 {
    public static void main(String[] args) throws IOException {
        //建立UDP服务
        DatagramSocket datagramSocket = new DatagramSocket();//IP等信息全部都在信息里面而不在Socket的发送端，所以用空的构造方法
        //准备数据，把数据封装到数据包中
        String data = "This is my first UDP example";
        //创建一个数据包
        DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(), 9090);
        //调用UDP的服务发送数据包
        datagramSocket.send(datagramPacket);
        //关闭资源,就是释放占用的端口号
        datagramSocket.close();


    }
}
