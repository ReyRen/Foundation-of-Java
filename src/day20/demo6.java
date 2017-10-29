package day20;

import java.io.*;

/**
 * Created by reyren on 2017/3/12.
 */
/*我们清楚读取文件数据使用缓冲数组读取效率高，sun也知道使用缓冲数组读取效率高，那么这时候，sun给我们提供了一个缓冲输入字节流对象，让我们可以有更高效率的读取文件


输入字节流的体系：
------------| InputStream 基类
---------------| FileInputStream 读取文件的输入字节流
---------------| BufferedInputStream 缓冲输入字节流的出现主要是为了提高读取文件数据的效率

其实该类内部只是维护了一个8KB的字节数组而已。

注意：
    凡是缓冲流都不具备读写文件的能力。所以需要借助于FileInputStream来read文件的数据
    调用bufferedInputStream的close方法实际上是关闭的是FileInputStream的close

使用BufferedInputStream的步骤：
    1.找到目标文件
    2.建立数据的输入通道
    3.建立缓冲输入字节流
    4.读取文件数据
    5.关闭资源
* */

public class demo6 {
    public static void main(String[] args) throws IOException {
        readTestBuffer();
    }
    public static void readTestBuffer() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");

        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲输入字节流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //读取文件数据
        int content = 0;
        while ((content = bufferedInputStream.read()) != -1){
            System.out.println((char)content);
        }
        //关闭资源
        bufferedInputStream.close();

    }
}
