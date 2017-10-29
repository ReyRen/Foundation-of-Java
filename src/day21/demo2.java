package day21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/13.
 */
/*输出字符流
    -----------| Write 输出字符流的基类 抽象类
    -------------| FileWrite 向文件输出数据的输出字符流


 FileWrite的使用步骤：
    1.找到目标文件
    2.建立数据通道
    3.写出数据
    4.关闭资源

 使用FileWriter要注意的：
    1.使用FileWriter写数据的时候，FileWriter内部是维护了一个1024个字符数组的，写数据的时候会先写入到内部维护的字符数组中，如果需要把数据真正写入到硬盘上，需要调用flush或者是close方法，或者是填满了内部的字符数组
    2.使用FileWriter写数据的时候，如果目标文件不存在，会直接创建文件，如果目标文件存在并且里面有数据加true会加数据
* */

public class demo2 {
    public static void main(String[] args) throws IOException {
        writeTest1();
    }

    public static void writeTest1() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test2.txt");
        //建立输出通道
        FileWriter fileWriter = new FileWriter(file,true);

        //准备数据把数据写出
        String data = "今天天气非常好";
        fileWriter.write(data);//字符流本身具备解码的功能，所有直接方便很多

        //关闭资源
        fileWriter.close();
    }
}
