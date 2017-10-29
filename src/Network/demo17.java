package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by reyren on 2017/2/10.
 */
/*实现登录与注册功能
    客户端与服务端链接的时候，就要提示客户端请选择功能

    客户端注册的时候，用户名和密码都是发送给客户端的，服务器需要把数据存到服务器端的文件上

    登录：登录的时候客户端输入用户名和密码发送给客户端，服务端需要校验，返回结果给客户端
*
*
* */
//客户端
public class demo17 {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
        //获取到socket的输出流对象
        OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());

        //获取socket的输入流对象
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //获取到键盘的输入流对象
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("请选择功能 : A (登录)  B （注册）" );

            String option = keyReader.readLine();

            if ("a".equalsIgnoreCase(option)){
                getInfo(socketOut, keyReader, option);
                //读取服务器反馈的信息
                String line = socketReader.readLine();
                System.out.println(line);
            }else if("b".equalsIgnoreCase(option)){
                getInfo(socketOut, keyReader, option);
                String line = socketReader.readLine();
                System.out.println(line);

            }
        }

    }

    private static void getInfo(OutputStreamWriter socketOut, BufferedReader keyReader, String option) throws IOException {
        System.out.println("请输入用户名:");
        String username = keyReader.readLine();
        System.out.println("请输入密码:");
        String password = keyReader.readLine();
        String info = option + " " + username + " " + password + "\r\n";

        socketOut.write(info);
        socketOut.flush();
    }
}
