package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by reyren on 2017/2/8.
 */
/*其中的receive是一个阻塞性的方法，没有接收到数据包就会等到，不会执行下面的代码
*
* */
//接收端
public class demo3 {
    public static void main(String[] args) throws IOException{
        //建立UDP服务,并且要监听一个端口
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        //准备空的数据包，用于存储数据
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //调用UDP服务接收数据
        datagramSocket.receive(datagramPacket);//数据实际上就是存储到了byte的字节数组中了
        System.out.println("接收端接收到的数据是：" + new String(buf, 0, datagramPacket.getLength()));//获取数据包存储了几个字节

        //关闭资源
        datagramSocket.close();
    }
}
