package day21;

import java.io.*;

/**
 * Created by reyren on 2017/3/14.
 */
/*装饰者模式:

*需求：编写一个类拓展BufferReader的功能，增强readLine方法返回的字符串带有行号
* 需求：编写一个类拓展BufferReader的功能，增强readLine方法返回的字符串带有分号
* 需求：编写一个类拓展BufferReader的功能，增强readLine方法返回的字符串带有双引号
*
*
*
* 增强一个类的功能的时候可以选择继承：
*   通过继承实现增强一个类的功能优点：代码结构简单明了
*                           缺点：使用不灵活继承体系会相当庞大
* */

public class demo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/users.txt");
        FileReader fileReader = new FileReader(file);
        //BufferedReader bufferedReader = new BufferedReader(fileReader);

        BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
        String line = null;
        while ((line = bufferedLineNum.readLine())!= null){
            System.out.println(line);
        }
    }
}
class BufferedLineNum extends BufferedReader{

    public BufferedLineNum(Reader in) {
        super(in);
    }
    int count = 1;
    @Override
    public String readLine() throws IOException {
        //int count = 0;

        String line = super.readLine();//得到一行的数据
        if (line == null){
            return null;
        }

        line = count + ". " + line;//行号加上空格就不是null了
        count++;

        return line;
    }
}
//带分号的缓冲输入字符流
class BufferedSemi extends BufferedReader{

    public BufferedSemi(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        if (line == null){
            return null;
        }
        line = line + ";";
        return line;
    }
}
//带双引号的缓冲输入字符流
class BufferedQuto extends BufferedReader{

    public BufferedQuto(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        if (line == null){
            return null;
        }
        line = "\"" + line + "\"";
        return line;
    }
}