package day16;

import java.util.TreeSet;

/**
 * Created by reyren on 2017/3/1.
 */
/*字符串的比较规则：
    1.对应位置有不同的字符出现，比较的就是对应位置上不同的字符
    2.对应位置上的字符都一样，比较的就是字符串的长度
*
* */

public class demo9 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("abc");
        tree.add("abw");
        tree.add("ab");
        System.out.println(tree);
    }
}
