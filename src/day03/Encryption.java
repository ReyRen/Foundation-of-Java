package day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by reyren on 16/9/23.
 */
public class Encryption {

    public static void main(String[] args) throws Exception{

       /* //在java的取模运算中，结果的正负号取决于被除数（左面的）
        System.out.println("结果" + (10%3));//1
        System.out.println("结果" + (10%-3));//1
        System.out.println("结果" + (-10%3));//-1
        System.out.println("结果" + (-10%-3));//-1*/

       /* int a = 0;
       // int sum = ++a;//前自增 a=a+1, sum =a
        int sum = a++;//后自增 sum = 0, a = a+1;
        System.out.println(sum);*/

      /* int i = 0;
        i = i++;
        System.out.println(i);//0*/


        /*byte b1 = 1;
        byte b2 = 2;
        //b2 = b2 + b1; //报错，需要强转
        b2 += b1;  //在编译的时候java编译器会进行强制类型转换*/


        // ==用于比较两个基本数据类型数据的时候，比较的是两个变量所存储的值是否一致
        // ==用于比较两个引用类型变量的时候，比较的是两个引用类型变量所记录的内存地址是否一致


        //&:即使左边为false，也是会算右边的 &&:左边为false时就不会再算右边的表达式，提高了效率

        //找到图片文件
        File inFile = new File("/Users/reyren/Downloads/原始图片.jpg");
        File outFile = new File("/Users/reyren/Downloads/加密.jpg");

        //建立数据通道，让图片的二进制数据流入
        FileInputStream input = new FileInputStream(inFile);
        FileOutputStream output = new FileOutputStream(outFile);

        //边读，把读到的数据异或一个数据，把数据写出
        int content = 0;
        while ((content = input.read()) != -1){   //如果没有到文件的末尾，那么就继续读取数据，读取到的数据已经到了content中了
            output.write(content^12);//再^12就解密了
        }

        //关闭资源
        output.close();
        input.close();
    }
}
