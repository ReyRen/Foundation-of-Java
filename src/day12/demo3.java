package day12;

/**
 * Created by reyren on 2016/12/23.
 */
/*String构造方法：
    String()创建空内容的字符串对象
    String(byte[] byte)使用一个字节数组构建一个字符串对象
    String(byte[] bytes, int offset, int length)
            bytes:要解码（数字解成字母）的数组
            offset:指定从数组中的拿个索引开始解码
            length：要解码多少个元素
*   String(char[] value)使用一个字符数组构建一个字符串
*   String(char[] value, int offset, int count)使用一个字符数组构建一个字符串，指定开始的索引值与使用的字符个数
*   String(int[] codePoint, int offset, int count)
*   String(String original)
*
*   记住：使用字节数字或字符数组都能构建字符串
* */
public class demo3 {
    public static void main(String[] args) {
        String str = new String();//调用了String()的构造方法
        byte[] buf = {97,98,99};
        str = new String(buf);//使用一个字节数组构建一个字符串对象
        System.out.println(str);//abc
        str = new String(buf, 1, 2);
        System.out.println(str);

        char[] arr = {'明','天','是','生'};
        str = new String(arr);
        str = new String(arr, 2, 2);
        System.out.println(str);
        int[] buf2 = {65,66,67};
        str = new String(buf2, 0, 3);
        System.out.println(str);
        str = new String("abc");
        System.out.println(str);
    }
}
