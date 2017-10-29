package day12;

import java.util.Arrays;

/**
 * Created by reyren on 2017/1/16.
 */
/*String类其他的方法
    String replace(char oldChar, char newChar)替换
    String[] split(String regex) 切割
    String substring(int beginIndex)
    String subString(int beginIndex, int endIndex)截取字串
    String toUpperCase()转大写
    String toLowerCase()转小写
    String trim（）去空格，只去除字符串首位的空格

*
*  */


public class demo5 {

    public static void main(String[] args) {
        String str = "今天晚上不考试";

        System.out.println("指定新内容替换旧的内容:" + str.replace("不","要好好"));

        str = "大家-下-午-好";
        String[] arr = str.split("-");
        System.out.println("字符串数组的内容是:" + Arrays.toString(arr));

        str = "广州传智播客";
        System.out.println(str.substring(2,3));//截取的包括启示不包括结尾，java中都是包头不包尾的

        str = "abc";
        System.out.println("转大写:" + str.toUpperCase());

        str = "        大家最近     都非常   努力";
        System.out.println("去空格:" + str.trim());
    }
}
