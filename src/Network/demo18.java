package Network;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * Created by reyren on 2017/2/10.
 */
/*
*
*
* */
//服务端
public class demo18 extends Thread {
    @Override
    public void run() {
        while (true) {


            try {
                //获取到socket的输入流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //获取socket的输出流对象
                OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());

                //读取客户端输入的信息
                String info = bufferedReader.readLine();
                String[] datas = info.split(" ");
                //获取用户的选择功能
                String option = datas[0];
                String username = datas[1];
                String password = datas[2];
                if ("a".equalsIgnoreCase(option)) {
                    //登录
                    Properties properties = new Properties();
                    //加载配置文件
                    properties.load(new FileReader(file));
                    if (properties.containsKey(username)) {
                        String temPass = properties.getProperty(username);
                        if (password.equals(temPass)) {
                            socketOut.write("欢迎" + username + "登录成功\r\n");
                            //socketOut.flush();
                        } else {
                            socketOut.write("PWD Wrong\r\n");
                            //socketOut.flush();
                        }
                    } else {
                        socketOut.write("该用户名不存在，请重新输入\r\n");
                        //socketOut.flush();
                    }
                    socketOut.flush();


                } else if ("b".equalsIgnoreCase(option)) {
                    /*//注册
                    File file = new File("/Users/reyren/Desktop/users.properties");
                    if (file.exists()) {
                        file.createNewFile();
                    }*/
                    //创建一个配置文件类
                    Properties properties = new Properties();
                    //加载原来的配置文件
                    properties.load(new FileReader(file));
                    if (!properties.containsKey(username)) {
                        //不存在用户名
                        properties.setProperty(username, password);
                        //生成一个配置文件
                        properties.store(new FileWriter(file), "users");
                        socketOut.write("注册成功\r\n");
                    } else {
                        //存在用户名
                        socketOut.write("用户名已经被注册，请重新输入\r\n");

                    }
                    socketOut.flush();

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    Socket socket;
    static File file = new File("/Users/reyren/Desktop/users.properties");

    static {
        try {
            if (!file.exists()) {

                file.createNewFile();
            }
        }catch(IOException e){
                e.printStackTrace();
            }


    }

    public demo18(Socket socket){
        this.socket = socket;
    }

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(9090);
            while(true){
                Socket socket = serverSocket.accept();
                new demo18(socket).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
