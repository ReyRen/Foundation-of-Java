package day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/13.
 */
/*字节流读取的是文件中的二进制数据，读到的数据并不会帮你转换成你看得懂的字符
字符流：会把读取到的二进制数据进行对应的编码与解码工作
 输入字符流：
 ------------| Reader 输入字符流的基类 抽象类
 --------------| FileReader 读取文件的输入字符流

 FileReader 用法：
    1.找到目标文件
    2.建立数据的输入通道
    3.读取数据
    4.关闭资源
* */

public class demo1 {
    public static void main(String[] args) throws IOException {
        //readTest1();
        readTest2();

    }
    public static void readTest1() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");

        //建立数据的输入通道
        FileReader fileReader = new FileReader(file);

        //读取数据
        int content = 0;
        while ((content = fileReader.read())!=-1){
            System.out.print((char) content);
        }
        //关闭资源
        fileReader.close();
    }

    public static void readTest2() throws IOException {
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");

        //建立数据的输入通道
        FileReader fileReader = new FileReader(file);

        //建立缓冲字符数组读取文件数据
        char[] buf = new char[1024];
        int length = 0;
        while ((length = fileReader.read(buf))!=-1){
            System.out.println(new String(buf,0,length));
        }
    }
}
