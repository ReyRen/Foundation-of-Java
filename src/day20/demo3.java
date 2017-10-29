package day20;

import java.io.*;

/**
 * Created by reyren on 2017/3/12.
 */
/*、拷贝图片
* */

public class demo3 {
    public static void main(String[] args) throws IOException {
        //找到目标文件
        File inFile = new File("/Users/reyren/Desktop/TEST/1.jpeg");
        File destFile = new File("/Users/reyren/Desktop/TEST/T1/2.jpeg");

        //建立数据的输入输出通道
        FileInputStream fileInputStream = new FileInputStream(inFile);
        //每次创建一个FileOutputStream的时候，默认情况下FileOutputStream的指针指向了文件的开始位置，每写出一次，指针都会相应的移动
        //所以就是说，不重新new FileOutputStream的时候没必要加上true
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);

        //建立缓冲数组，做到边读边写
        byte[] buf = new byte[1024];
        int length = 0;
        while( (length = fileInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);//必须做到读多少写多少，不然会有空的，就像demo1中那样，导致copy的文件会大
        }
        //关闭资源，先开后关
        fileOutputStream.close();
        fileInputStream.close();

    }

}
