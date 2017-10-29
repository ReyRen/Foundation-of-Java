package day21;

import java.io.*;

/**
 * Created by reyren on 2017/3/13.
 */
/*使用字符流拷贝文件

注意：
    如果FileReader如果读到的数据找不到对应的字符，那么会返回一个未知字符对应的数字，未知字符占一个字节。所以这就是为什么拷贝图片的时候会小于原图片，只能使用字节流来弄图片了

何时使用字节流何时使用字符流
    字符流应用场景：
        如果是读写字符数据的时候就使用字符流（文件）
    字节流的应用场景：
        如果读写的数据都不需要转换成字符的时候则使用字节流（比如图片），转换字符就是转换层我们能读懂的，而不是byte或数字
* */

public class demo3 {
    public static void main(String[] args) throws IOException {
        File infile = new File("/Users/reyren/Desktop/TEST/WechatIMG10.jpeg");
        File outfile = new File("/Users/reyren/Desktop/TEST/T1/T2/tt.jpeg");

        FileReader fileReader = new FileReader(infile);
        FileWriter fileWriter = new FileWriter(outfile);

        //建立缓冲字符数组，进行边读编写
        char[] buf = new char[1024];
        int length = 0;
        while ((length = fileReader.read(buf)) != -1){
            fileWriter.write(buf,0,length);
        }
        fileWriter.close();
        fileReader.close();
    }
}
