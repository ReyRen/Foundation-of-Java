package day22;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by reyren on 2017/3/16.
 */
/*需求:把首mp3先切割，然后再把这些文件合并起来、
*
*
*
* */
public class demo2 {
    public static void main(String[] args) throws IOException {
        //cutFile();
        mergeFile();
    }

    //切割mp3
    public static void cutFile() throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/Test.mp3");

        File dir = new File("/Users/reyren/Desktop/TEST/T1");

        //建立数据输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组读取
        byte[] buf = new byte[1024*1024];
        int length = 0;
        for (int i = 0; (length = fileInputStream.read(buf))!=-1;i++){
            FileOutputStream fileOutputStream = new FileOutputStream(new File(dir,"part"+i+".mp3"));
            fileOutputStream.write(buf,0,length);
            fileOutputStream.close();
        }
        fileInputStream.close();
    }

    //合并
    public static void mergeFile() throws IOException {
        //找到目标文件夹
        File dir = new File("/Users/reyren/Desktop/TEST/T1");
        //通过目标文件夹找到所有的mp3文件然后把所有的mp3文件添加到vector中
        Vector<FileInputStream> vector = new Vector<FileInputStream>();
        File[] files = dir.listFiles();
        for (File file:files){
            if (file.getName().endsWith(".mp3")){
                vector.add(new FileInputStream(file));
            }
        }
        //通过vector获取迭代器对象
        Enumeration<FileInputStream> e = vector.elements();

        //创建序列流
        SequenceInputStream sequenceInputStream = new SequenceInputStream(e);

        //建立文件的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/reyren/Desktop/TEST/T1/merge.mp3");
        //建立缓冲数组读取文件
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = sequenceInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        fileOutputStream.close();
        sequenceInputStream.close();
    }
}
