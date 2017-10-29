package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/9.
 */
//聊天服务端
public class demo13 {
    public static void main(String[] args) throws IOException{
        //建立TCP服务端
        ServerSocket serverSocket = new ServerSocket(9090);

        //接收客户端连接产生Socket
        Socket socket = serverSocket.accept();

        //获取到socket的输入流对象
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //还要获取Socket的输出流对象
        OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());

        //获取键盘的输入流对象
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

        //读取客户端的数据
        String line = null;
        while((line = socketReader.readLine()) != null){
            System.out.println("服务端接收到的数据---" + line);
            System.out.println("请输入回送数据: ");
            line = keyReader.readLine();
            socketOut.write(line + "\r\n");
            socketOut.flush();
        }

        serverSocket.close();
    }
}
