package day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/13.
 */
/*字符流的缓冲类：
   输入字符流
   -------------| Reader 输入字符流的基类 抽象了
   -------------| FileReader 读取文件字符的输入字符流
   -------------| BufferedReader 缓冲输入字符流 出现的目的是为了提高读取文件字符的效率和拓展了FileReader的功能。其实该类内部也是维护了一个字符数组


   BufferReader的使用步骤：
    1.找到目标文件
    2.建立数据的输入通道
*
*
* */

public class demo4 {
    public static void main(String[] args) throws IOException {
        readTest1();
    }

    public static void readTest1() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Test.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        /*int content = bufferedReader.read();//读到一个字符，从内存中拿出来的（先把数据全放到内部维护的字符数组中，虽然是一个字符取，但是相当于从内存中取了，所以效率高）
        System.out.println((char) content);*/

        //使用bufferReader拓展的功能 readline一次读取一行文本，如果读到了文件的末尾，返回null表示
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {//虽然readline返回的是一行数据，但是返回的是不包含\r\n的
            System.out.println(line);
        }


        bufferedReader.close();
    }
    //实现自己的readLine方法
    public static String myReadLine(FileReader fileReader) throws IOException {
        StringBuilder sb = new StringBuilder();//用来保存每次所读到的数据
        int content = 0;
        while ((content = fileReader.read()) != -1){
            if (content == '\r'){
                continue;
            }else if(content == '\n'){
                break;
            }else {
                sb.append((char)content);
            }
        }
        return sb.toString();
    }
}
