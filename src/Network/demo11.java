package Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
/*
*
* */
//TCP服务端
public class demo11 {
    public static void main(String[] args) throws IOException {
        //建立TCP服务端并且监听端口即可
        ServerSocket serverSocket = new ServerSocket(9090);
        //接收客户端的链接,该方法也是阻塞型的方法，没有客户端与其链接时，会一直等待下去
        Socket socket = serverSocket.accept();
        //获取输入流对象，读取客户端发送的内容
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = 0;
        length = inputStream.read(buf);
        System.out.println("服务器接收到了:" + new String(buf, 0, length));

        //获取socket的输出流对象，向客户端发
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端你好啊".getBytes());

        //关闭资源
        serverSocket.close();
    }
}
