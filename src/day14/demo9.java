package day14;

/**
 * Created by reyren on 2017/2/13.
 */
/*数组：是存储同一种数据类型的集合容器

数组的特点：
    1.只能存储同一类型的数据
    2.一旦初始化，长度就固定
    3.数组中的元素与元素之间的内存地址是连续的
注意：
    Object类型的数组能够存储任意类型的数据的

需求：搜集我们班同学的兴趣爱好
用数组，长度不固定，太少不够，太多又浪费
*
* */
public class demo9 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 12;//只能存储int类型的数据
        Object[] a = new Object[10];
        a[1] = "abc";
        a[2] = 12;
        a[3] = 'a';

    }
}
