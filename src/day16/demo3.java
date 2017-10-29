package day16;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by reyren on 2017/2/25.
 */
/*set接口：
    添加元素的顺序与出来的顺序是不一致的
*
*
* */
public class demo3 {
    public static void main(String[] args) {
        Set set = new HashSet();//实现类

        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");

        System.out.println(set);//添加顺序与出来顺序不一致,并且元素不可重复
    }
}
