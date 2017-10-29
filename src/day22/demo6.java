package day22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by reyren on 2017/3/18.
 */
/*打印流：printStream 打印流可以打印任意类型的数据，而且打印数据之前都会先把数据转换成字符串再进行打印
* */

public class demo6 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fileOutputStream = new FileOutputStream("/Users/reyren/Desktop/TEST/print.txt");

        fileOutputStream.write(97);
        fileOutputStream.write("97".getBytes());
        fileOutputStream.close();*/

        /*File file = new File("/Users/reyren/Desktop/TEST/print.txt");
        //创建打印流
        PrintStream printStream = new PrintStream(file);
        printStream.println(97);
        printStream.println(3.14);
        printStream.println('a');
        printStream.println(true);
        Animal animal = new Animal("老鼠","黑色");
        printStream.println(animal);//一个对象转换成String的话，会调用这个对象的toString方法

        System.out.println();//默认标准的输出流就是往控制台输出的,out指定了一个pringStream
        System.setOut(printStream);//重新设置了标准的输出流对象
        System.out.println("猜猜我在哪");*/

        //printStream还能搜集异常的日志信息
        File logFile = new File("/Users/reyren/Desktop/TEST/log.log");
        PrintStream printStream = new PrintStream(new FileOutputStream(logFile,true));//这样就能做到追加

        try {
            int c = 4/0;
            System.out.println("c="+ c);
        } catch (Exception e) {
            e.printStackTrace(printStream);//这样会将异常信息打印到了控制带
        }


    }
}
class Animal{
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "名字:" + this.name + " 颜色:" + this.color;
    }
}