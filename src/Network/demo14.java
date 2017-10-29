package Network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
/*、
*
*
* */
//模拟Tomcat服务器
public class demo14 extends Thread {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        //不断接受客户端的链接
        while (true){
            Socket socket = serverSocket.accept();
            new demo14(socket).start();
        }
    }

    Socket socket;//成员变量
    public demo14(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            /*//建立tcp的服务器
            ServerSocket serverSocket = new ServerSocket(9090);
            //接收客户端的链接
            Socket socket = serverSocket.accept();*/
            //获取socket的输出流对象
            OutputStream outputStream = socket.getOutputStream();
            //把数据写到浏览器上
            outputStream.write("<html><head><title>aaa</title></head><body>你好啊浏览器:</body></html>".getBytes());
            //关闭资源
            //serverSocket.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
