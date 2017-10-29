package Network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
public class demo16  {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("192.168.1.194"),9090);

        //获取socoket输入流
        InputStream inputStream = socket.getInputStream();

        //获取文件的输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/reyren/Desktop/1.jpeg");

        //边读边写
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buf)) != -1){
            fileOutputStream.write(buf, 0, length);
        }
        fileOutputStream.close();
        socket.close();
    }
}
