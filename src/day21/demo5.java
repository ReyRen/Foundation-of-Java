package day21;

import javax.print.attribute.standard.Fidelity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/14.
 */
/*输出字符流：
    -------------------| Write 所有输出字符流的基类 抽象类
    --------------------------| FileWriter 向文件输出字符数据的字符流
    --------------------------| BufferedWriter 缓冲输出字符流 缓冲输出字符流作用：提高FileWriter的写数据效率与拓展FileWriter功能
*
* BufferWriter使用：
*   1.找到目标文件
*   2.建立数据的输出通道
*   3.写出数据
*
* 缓冲输入输出字符流用户登录注册
* */
public class demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/BW.txt");

        FileWriter fileWriter = new FileWriter(file,true);
        //建立缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);//内部只不过是提供了一个8192长度的字符数组作为缓冲区而已，拓展了fileWriter的功能

        //写出数据
        bufferedWriter.newLine();//实际上就是输出换行，其实就是输出一个\r\n
        bufferedWriter.write("打家里好dsddadadadad");
        bufferedWriter.close();
    }
}
