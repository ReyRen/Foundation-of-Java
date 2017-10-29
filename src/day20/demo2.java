package day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/12.
 */
/*写数据

输出字节流：
    OutputStream 是所有输出字节流的超类（父类）抽象类
        我们只能用其子类 FileOutputStream向文件输出数据的输出字节流
FileOutputStream
    1.找到目标文件
    2.建立数据的输出通道
    3.准备数据，把数据转换成字节数组写出
    4.关闭资源
FileOutputStream要注意的细节：
    1.使用FileOutputStream的时候如果目标文件不存在那么会自动创建目标文件对象
    2.如果目标文件已经存在会先清空目标文件的数据再写入数据
    3.FileOutputStream fileOutputStream = new FileOutputStream(file);写成
      FileOutputStream fileOutputStream = new FileOutputStream(file,true);可以进行追加数据
    4.FileOutputStream的write方法写数据的时候，虽然接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是把低八位的二进制数据写出，其他24位数据全部丢弃

* */

public class demo2 {
    public static void main(String[] args) throws IOException {
        //writeTest1();
        writeTest2();
    }

    public static void writeTest1() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //准备数据，把数据写出
        fileOutputStream.write('h');
        fileOutputStream.write('e');
        fileOutputStream.write('l');
        fileOutputStream.write('l');

        fileOutputStream.close();
    }

    public static void writeTest2() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String data = "hello world";
        fileOutputStream.write(data.getBytes());//转换成字节数组
        fileOutputStream.close();
    }

}
