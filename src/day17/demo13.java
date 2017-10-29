package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by reyren on 2017/3/4.
 */
/*
*
* */
public class demo13 {
    public static void main(String[] args) {
        String content = "有事没事联系:1122423@163.com 有事没事联系:1122423@qq.com 有事没事联系:1122423@163.com.cn 有事没事联系:1122423@163.net 有事没事联系:1122423@163.cn";

        String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";

        //字符串的正则编译成正则对象
        Pattern p = Pattern.compile(reg);
        //使用正则对象产生匹配器对象
        Matcher m = p.matcher(content);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
