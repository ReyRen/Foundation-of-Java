package day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/15.
 */
/*装饰者设计模式：增强一个类的功能，而且还可以让这些类互相装饰
装饰着设计模式步骤：
    1.在装饰类的内部维护一个被装饰类的引用
    2.让装饰类有一个共同的父类或父接口

需求一：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有行号
需求二：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有分号
需求三：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有双引号
需求四：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有行号+分号
需求五：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有分号+双引号
需求六：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有双引号+分号
需求七：编写一个拓展BufferedReader功能，增强readLine方法返回的字符串带有行号+分号+双引号

继承实现增强类与装饰实现增强类的区别：
    继承实现增强类：
        优点：代码结构清晰，实现简单
        缺点：体系过于庞大
    修饰者模式实现的增强类：
        优点：内部可以同过多态技术对多个需要增强的类进行增强
        缺点：需要内部通过多态技术维护需要增强的类的实例，进而使得代码稍微复杂
* */

public class demo8 {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //带行号的缓冲输入字符流
        BufferedLineNum2 bufferedLineNum2 = new BufferedLineNum2(bufferedReader);
        //带分号的缓冲输入字符流

        BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum2);
        String line = null;
        while ((line = bufferedLineNum2.readline())!= null){
            System.out.println(line);
        }

    }
}
//带行号的缓冲输入字符流
class BufferedLineNum2 extends BufferedReader{
    //内部维护一个被装饰类的引用
    BufferedReader bufferedReader;
    int count = 1;

    public BufferedLineNum2(BufferedReader bufferedReader){
        super(bufferedReader);
        this.bufferedReader = bufferedReader;
    }

    //实现readline
    public String readline() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null){
            return null;
        }
        line= count + " " + line;
        count++;
        return line;
    }
}
//带分号的缓冲输入字符流
class BufferedSemi2 extends BufferedReader{//继承的目的是为了让装饰类的对象可以作为参数进行传递达到互相装饰的效果
    //内部维护一个被装饰类的引用
    BufferedReader bufferedReader;
    public BufferedSemi2(BufferedReader bufferedReader){
        super(bufferedReader);//注意本句话没有任何的作用，只不过是为了让代码不报错，这样就是指定了父类的一个参数的构造方法，不然父类没有无参的构造函数
        this.bufferedReader = bufferedReader;
    }
    //实现readline
    public String readline() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null){
            return null;
        }
        line= line + ";";
        return line;
    }
}