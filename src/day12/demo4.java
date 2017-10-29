package day12;

import java.util.Arrays;

/**
 * Created by reyren on 2016/12/28.
 */
/*String类的获取方法：
    int length()获取字符串长度
    char charAt(int index)获取特定位置的字符
    int indexOf(String str)获取特定字符的位置，如果子串没有出现在字符串中则返-1
    int lastIndexOf(int ch)获取最后一个字符的位置

  String类的判断的方法：
    boolean endsWith(String str)是否以指定字符结束
    boolean isEmpty()是否长度为0
    boolean contains(CharSequences)是否包含指定序列应用
    boolean equals(Object anObject)是否相等
    boolean equalsIgnoreCase(String anotherString)忽略大小写是否相等


  String类转换的方法：
    char[] toCharArray()  将字符串转换为字符数组
    byte[] getBytes();

    字节数组，字符数字和字符串三者之间是可以相互转化的
*
* */
public class demo4 {
    public static void main(String[] args) {
        /*String str = "abc中国ab中国";
        System.out.println("字符串的字符个数" + str.length());
        System.out.println("根据索引值获取对应的字符" + str.charAt(3));
        System.out.println("查找子串第一次出现的索引值" + str.indexOf("中国"));
        System.out.println("查找子串最后一次出现的索引值" + str.lastIndexOf("中国"));*/

        /*String str = "demo.java";
        System.out.println("是否以指定的字符串结束" + str.endsWith("java"));
        System.out.println("判断字符串是否为空内容" + str.isEmpty());//str = null的时候就是空指针异常，因为没有指向对象
        System.out.println("判断字符串是否包含指定的内容" + str.contains("de"));
        System.out.println("判断两个字符串的内容是否一致(是忽略大小写比较的):" + "demO.java".equalsIgnoreCase(str));*/

        String str = "demo.java";
        char[] buf = str.toCharArray();
        System.out.println("字符数组:" + Arrays.toString(buf));

        //转成字节数组
        byte[] buf2 = str.getBytes();
        System.out.println(Arrays.toString(buf2));
    }
}
