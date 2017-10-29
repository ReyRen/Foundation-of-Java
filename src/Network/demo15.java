package Network;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

/**
 * Created by reyren on 2017/2/9.
 */
/*填写一个服务端可以给多个客户端发送图片（多线程）
*
* */
//服务端
public class demo15 extends Thread {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(9090);

        while(true){
            //不断的接受用户的请求链接
            Socket socket = serverSocket.accept();
            new demo15(socket).start();
        }
    }
    Socket socket;

    //使用该集合是用于存储IP地址的
    static HashSet<String> ips = new HashSet<String>();

    public demo15 (Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            /*//建立tcp服务，并且监听
            ServerSocket serverSocket = new ServerSocket(9090);*/
            //接受用户的链接
            //Socket socket = serverSocket.accept();

            //获取Socket的输出流对象
            OutputStream outputStream = socket.getOutputStream();

            //获取图片的输入流对象
            FileInputStream fileInputStream = new FileInputStream("/Users/reyren/Desktop/WechatIMG10.jpeg");

            //读取图片数据，把数据写出
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = fileInputStream.read(buf)) != -1){
                outputStream.write(buf, 0, length);

            }

            String ip = socket.getInetAddress().getHostAddress();//获取对方的IP地址
            if (ips.add(ip)){
                System.out.println("恭喜" + ip + "同学成功下载,当前是下载人数是" + ips.size());
            }
            //System.out.println("下载的IP是:" + ip);


            fileInputStream.close();
            //serverSocket.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
