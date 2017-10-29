package Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
/*TCP协议：
    1.基于IO流进行数据的传输的，是面向连接的
    2.TCP进行数据传输的时候是没有大小限制的
    3.通过三次握手的机制保证数据的完整性，是可靠协议
    4.tcp是面向连接的，所以速度慢
    5.tcp是区分客户端与服务端的

  文件的传输使用TCP协议

  TCP下的Socket：
    Socket(客户端类) tcp的客户端一旦启动，马上与服务器建立连接
    ServerSocket(服务端类)

  TCP客户端步骤
    1.建立TCP客户端服务
    2.获取到对应的流对象
* */
public class demo10 {
    public static void main(String[] args) throws IOException{
        //建立TCP服务
        Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
        //获取Socket的输出流
        OutputStream outputStream = socket.getOutputStream();
        //利用输出流对象把对象写出即可
        outputStream.write("服务端你好".getBytes());

        //获取服务端会送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("客户端接收到数据是:" + new String(buf, 0, length));

        //关闭资源
        socket.close();//同样的outputStream也是会关闭的
    }
}
