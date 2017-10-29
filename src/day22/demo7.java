package day22;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by reyren on 2017/3/18.
 */
/*编码与解码：
    编码：把看得懂的字符变成了看不懂的码值
    解码：把码值查找对应的字符

    UTF-8:中文3字节，英文1字节
    UTF-16:中文英文都是2字节
*
* 注意：
*   1.以后编码与解码一般我们都使用统一的码表，否则非常容易出现乱码
*
* */

public class demo7 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*String str = "中国";
        byte[] buf = str.getBytes("gbk");//平台默认的编码变是UTF-8编码表,一个中文三字节---编码,
        System.out.println("数组的元素：" + Arrays.toString(buf));

        //str = new String(buf);//默认使用的是utf-8,但是之前编码是gbk，所以解出来不对
        str = new String (buf,"gbk");

        System.out.println("解码后的字符串" + str);*/

       /* String str = "a中国";
        byte[] bytes = str.getBytes("unicode");//编码与解码的时候如果写unicode其实就是用了utf-16,每次出来的都加有-2 -1是标志而已
        System.out.println(Arrays.toString(bytes));*/

       String str = "大家好";
        byte[] buf = str.getBytes();//使用的是utf-8编码
        System.out.println("编码后的数组是:" + Arrays.toString(buf));
        str = new String(buf,"iso8859-1");

        byte[] buf2 = str.getBytes("iso8859-1");//找回之前的那批数字了
        str = new String(buf2,"utf-8");

        System.out.println(str);
    }
}
