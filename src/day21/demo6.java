package day21;

import java.io.*;
import java.util.Scanner;

/**
 * Created by reyren on 2017/3/14.
 */
/*使用缓冲输入输出字符流用户登录注册
* */

public class demo6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {


        while (true) {
            System.out.println("请选择功能: A(注册)   B(登录)");
            String option = scanner.next();

            if ("a".equalsIgnoreCase(option)){
                //注册
                reg();
            }else if ("b".equalsIgnoreCase(option)){
                //登录
                login();
            }else {
                System.out.println("您的输入有误请重新输入");
            }
        }
    }

    //注册
    public static void reg() throws IOException {
        System.out.println("请输入用户名:");
        String userName = scanner.next();
        System.out.println("请输入密码:");
        String passwd = scanner.next();
        //把用户的注册的信息写到文件上
        File file = new File("/Users/reyren/Desktop/TEST/users.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //把用户信息写出
        String info = userName + " " + passwd;
        bufferedWriter.write(info);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }

    //登录
    public static void login() throws IOException {
        System.out.println("请输入用户名:");
        String userName = scanner.next();
        System.out.println("请输入密码:");
        String passwd = scanner.next();
        //读取文件的信息，查看是否有该用户的信息存在

        String info = userName + " " + passwd;

        File file = new File("/Users/reyren/Desktop/TEST/users.txt");
        FileReader fileReader = new FileReader(file);

        //建立缓冲输入字符流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        boolean islogin = false;//用于记录是否登录成功的标志，默认是登录失败的
        while ((line = bufferedReader.readLine()) != null){
            if (info.equals(line)){
                islogin = true;
                break;
            }

        }
        if (islogin){
            System.out.println("欢迎" +userName + "登录成功");
        }else {
            System.out.println("不存在该用户信息请注册");
        }
    }
}
