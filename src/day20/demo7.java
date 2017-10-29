package day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/12.
 */
/*输出字节流：
    ----------------| OutputStream 所有输出字节流的基类 抽象类
    --------------------| FileOutputStream 向文件输出数据的输出字节流
    --------------------| BufferedOutputStream 缓冲输出字节流 内部也是维护了8kb的字节数组而已
*
* 使用BufferedOutputStream的步骤：
* 1.找到目标文件
*
*
* 注意：
*   1.使用BufferedOutputStream写数据的时候，他的write方法先把数据写到内部维护的字节数组中
*   2.使用BufferedOutputStream写数据的时候，如果需要把数据真正的写到硬盘上面需要调用flush或者是close方法,或者内部维护的字节数组放不下时也会自动flush的
* */
public class demo7 {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write("hello world".getBytes());

        //把缓冲数组中内部的数据写到硬盘上面
        bufferedOutputStream.flush();

    }
}
