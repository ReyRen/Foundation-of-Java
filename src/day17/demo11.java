package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by reyren on 2017/3/4.
 */
/*
* 查找：
*
* 查找需要使用的对象：
*   1.Pattern(正则对象)
*       指定字符串正则表达式编译成为此类的实例。然后，可将得到的模式用于创建Matcher对象，依照正则表达式，该对象可以与任意字符序列匹配。
*       执行匹配所涉及的所有状态都驻留在匹配器中，所以多个匹配器能共享一个模式，经典的调用顺序：
*           Pattern p = Pattern,compile("正则");
*           Matcher m = p.matcher("aaab");
*           boolean b = m.matches();
*   2.Matcher(匹配器对象)
*
*
*
*   匹配器使用到的方法:
*       1.find()通知匹配器去匹配字符串查找符合规则的字符串，如果能查到符合规则的字符串则返回true否则返回false
*       2.group()获取符合规则的子串
*
*   注意使用group方法的时候，一定要先调用find方法让匹配器查找符合规则的字符串，否则报错
*
* */
public class demo11 {
    public static void main(String[] args) {
        //找出三个字母组成的单词
        String content = "da jia de jia qi wan bi liao hai kai xin ma";
        String reg = "\\b[a-zA-Z]{3}\\b";
        //先要把字符串的正则编译成pattern的对象
        Pattern p = Pattern.compile(reg);
        //使用正则对象匹配字符串，用于产生matcher对象
        Matcher m = p.matcher(content);
        /*System.out.println("有符合规则的字符串吗？" + m.find());
        System.out.println("获取结果:" + m.group());*/
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
