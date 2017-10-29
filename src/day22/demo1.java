package day22;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by reyren on 2017/3/15.
 */
/*
*需求：将/Users/reyren/Desktop/TEST/Test.txt和Test2.txt合并
* */

public class demo1 {
    public static void main(String[] args) throws IOException {
        //merge2();
        merge3();
    }

    public static void merge1() throws IOException {
        //找到目标文件
        File inFile1 = new File("/Users/reyren/Desktop/TEST/Test.txt");
        File inFile2 = new File("/Users/reyren/Desktop/TEST/Test2.txt");
        File outFile = new File("/Users/reyren/Desktop/TEST/TestMerge.txt");

        //建立数据输入输出通道
        FileInputStream fileInputStream = new FileInputStream(inFile1);
        FileInputStream fileInputStream2 = new FileInputStream(inFile2);
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);

        //把输入流存储到集合中，再从集合中读取出来
        ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
        list.add(fileInputStream);
        list.add(fileInputStream2);
        //准备一个缓冲数组
        byte[] buf = new byte[1024];
        int length = 0;
        for (int i = 0; i < list.size(); i++){
            FileInputStream fileInputStream1 = list.get(i);
            while( (length = fileInputStream1.read(buf))!= -1){
                fileOutputStream.write(buf,0,length);
            }
            fileInputStream1.close();
        }
        fileOutputStream.close();

    }

    //使用sequenceInputStream合并文件
    public static void merge2() throws IOException {
        File inFile1 = new File("/Users/reyren/Desktop/TEST/Test.txt");
        File inFile2 = new File("/Users/reyren/Desktop/TEST/Test2.txt");
        File outFile = new File("/Users/reyren/Desktop/TEST/TestMerge.txt");

        FileInputStream fileInputStream1 = new FileInputStream(inFile1);
        FileInputStream fileInputStream2 = new FileInputStream(inFile2);
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);

        //建立序列流对象
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);

        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = sequenceInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        //关闭资源
        sequenceInputStream.close();
        fileOutputStream.close();
    }
    //将三个文件合并成一个文件
    public static void merge3() throws IOException {
        File inFile1 = new File("/Users/reyren/Desktop/TEST/Test.txt");
        File inFile2 = new File("/Users/reyren/Desktop/TEST/Test2.txt");
        File inFile3 = new File("/Users/reyren/Desktop/TEST/TestMerge.txt");
        File outFile = new File("/Users/reyren/Desktop/TEST/TestMergeEND.txt");

        FileInputStream fileInputStream1 = new FileInputStream(inFile1);
        FileInputStream fileInputStream2 = new FileInputStream(inFile2);
        FileInputStream fileInputStream3 = new FileInputStream(inFile3);
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);

        Vector<FileInputStream> vector = new Vector<FileInputStream>();
        vector.add(fileInputStream1);
        vector.add(fileInputStream2);
        vector.add(fileInputStream3);
        Enumeration<FileInputStream> e = vector.elements();

        SequenceInputStream sequenceInputStream = new SequenceInputStream(e);

        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = sequenceInputStream.read(buf))!= -1){
            fileOutputStream.write(buf,0,length);
        }
        sequenceInputStream.close();
        fileOutputStream.close();
    }
}
