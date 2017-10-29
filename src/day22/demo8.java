package day22;

import java.io.*;
import java.util.Scanner;

/**
 * Created by reyren on 2017/3/18.
 */
/*转换流：
     输入字节流的转换流：
        InputStreamReader  输入字节流到输入字符流
     输出字节流的转换流:
        outputStreamWriter
  作用：
    1.如果目前所获取到的是字节流需要转换成字符流使用就可以使用转换流
    2.使用转换流可以指定编码表进行读写文件
* */

public class demo8 {
    public static void main(String[] args) throws IOException {
        //readTest();
       // writeTest();
        //writeTest2();
        readTest2();
    }
    public static void readTest() throws IOException {
        //接收键盘录入
        //Scanner scanner = new Scanner(System.in);//System.in是获取了标准的输入流，就是从控制台输入的，返回的是inputStream
        InputStream in = System.in;
        //System.out.println("读到的字符:" + (char)in.read());//这个read方法一次只能读取一个字节
        //现在的目的是需要把字节流转换成字符流
        InputStreamReader inputStreamReader = new InputStreamReader(in);

        //有了字符流就能使用字符流的缓冲类
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println("内容是:" + line);
        }

    }
    public static void writeTest() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Tstream.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //fileOutputStream.write("大家好".getBytes());//这中输出比较麻烦

        //需要把输出字节流转换成输出字符流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write("大家好");
        outputStreamWriter.close();
    }
    //使用输出字节流的转换流指定码表写出数据
    public static void writeTest2() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Tstream2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //把输出字节流转换成字符流并且指定码表
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");
        outputStreamWriter.write("a新中国好啊");//文件大小11字节
        outputStreamWriter.close();
    }
    //使用输入字节的转换流指定码表进行读取文件数据
    public  static  void readTest2() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Tstream2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //创建字节流的转换流并且指定码表进行读取
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"gbk");
       //注意这里不能用readline是因为这是转换成了字节符流而不是bufferedReader
        char[] buf = new char[1024];
        int length = 0;
        while ((length = inputStreamReader.read(buf))!=-1){
            System.out.println(new String(buf,0,length));
        }

    }

}
