package Network;

import com.sun.tools.jdi.SocketListeningConnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
/*需求：客户端与服务端一问一答；聊天
*
*如果使用BufferReader的readline方法，一定要加上\r\n才能把数据写出
* 使用字符流一定要调用flush方法数据才能写出
*
*
* */
//聊天客户端
public class demo12 {
    public static void main(String[] args) throws IOException {
        //建立TCP客户端服务
        Socket socket = new Socket(InetAddress.getLocalHost(), 9090);

        //获取到Socket的输出流对象
        OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());//直接输出字符流，不是字节流
        //获取键盘的输入流对象，读取数据
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        //获取Socket的输入流对象
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //不断读取键盘的数据，把数据写出
        while ((line = keyReader.readLine()) != null){
            socketOut.write(line + "\r\n");
            //刷新
            socketOut.flush();//字符流都到了缓冲区了

            //读取服务端回送的数据
            line = socketReader.readLine();
            System.out.println("服务端回送的数据是：" + line);
        }



        //关闭
        socket.close();

    }
}
