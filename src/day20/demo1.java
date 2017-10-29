package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/11.
 */
/*如果我们需要读取文件的内容数据，要使用IO流

IO流的分类：
    如果按照数据的流向划分：
        判断使用输入流还是输出流的依据：
            以当前程序作为参照物，观察数据是流入还是流出
        输入流：数据流入
        输出流：数据流出

    如果按照处理的单位划分
        字节流：读取文件中的二进制数据，读取到的二进制数据不会经过任何的处理
        字符流：字符流也是读取文件中的二进制数据，不过会把二进制数据转换成我们能识别的字符
                读取的数据是以字符为单位的
                字符流=字节流+解码

字节流：
    输入字节流
        -----------| InputStream 所有输入字节流的基类  抽象类
        ---------------|FileInputStream  读取文件数据的输入字节流
     使用FileInputStream读取文件数据的步骤：
        1.找到目标文件
        2.搭建数据的输入通道
        3.读取文件的数据使用流对象的read方法即可
        4.关闭资源（释放资源）
            资源文件一旦使用完毕应该马上释放，否则其他程序无法对该资源文件进行其他的操作

    输出字节流
* */

public class demo1 {
    public static void main(String[] args) throws IOException {
        //readTest1();
        //readTest2();
        //readTest3();
        readTest4();
    }
    //读取的方式有缺陷，无法读取完整一个文件的数据
    public static void readTest1() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");
        //搭建数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //读取文件的数据使用流对象的read方法即可
        int content = fileInputStream.read();//读取一个字节的数据(一个英文一个字节)，把读取的数据返回。
        System.out.println("读到的内容是:" + (char)content);
        //关闭资源（释放资源）
        fileInputStream.close();
    }

    //使用循环读取文件的数据
    public static void readTest2() throws IOException {
        long startTime = System.currentTimeMillis();
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/1.jpeg");
        //搭建数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //读取文件的数据
        int content = 0;//声明该变量用于存储读取到的数据
        while ((content = fileInputStream.read())!=-1){
            System.out.print((char)content);
        }
        fileInputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("\r\n读取的时间是:" + (endTime-startTime));
    }
    //使用缓冲数组读取,无法读取完整一个文件的数据
    public static void readTest3() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");
        //搭建数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲字节数组读取文件的数据
        byte[] buf = new byte[1024];//就相当于超市中的购物车
        int length = fileInputStream.read(buf);//数据已经读取到了字节数组中了，如果使用read方法读取数据传入了字节数组，那么数据是存储到字节数组中的，而read方法的返回值是表示的是本次读取了几个字节数据到字节数组中
        //使用字节数组构建字符串
        String content = new String(buf,0,length);
        System.out.println(length);
        System.out.println("内容：" + content);
        //关闭资源
        fileInputStream.close();
    }
    //使用缓冲数组配合循环一起读取
    public static void readTest4() throws IOException {
        long startTime = System.currentTimeMillis();
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/1.jpeg");
        //搭建数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组配合循环读取文件的数据
        int length = 0;//保存每次读取到的字节个数
        byte[] buf = new byte[1024];//存储读取到的数据,缓冲数组的长度一般是1024的倍数，和计算机的处理有关
        while ((length = fileInputStream.read(buf))!=-1){//read方法如果读到文件的末尾会返回-1
            System.out.println(new String(buf,0,length));
        }
        fileInputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("\r\n读取的时间是:" + (endTime-startTime));
    }
}
