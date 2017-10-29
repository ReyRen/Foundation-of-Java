package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by reyren on 2017/3/4.
 */
/*数组的工具类（Arrays）：
        1.复制数组
            copyOf(boolean[] original, int newLength);
                original:源数组
                newLength:新数组的长度
        2.复制部分数组;
            copyOfRange(boolean[] original, int from, int to);
                original[] 源数组
                from 开始拷贝的索引值
                to 结束的索引值
        3.比较两个数组是否相同（元素是否一致包括顺序）
            equals(int[], int[])
        4.将数组变成集合
            List asList(T[])
*
*
* */

public class demo7 {
    public static void main(String[] args) {
        Integer[] arr = {10,8,6,9};
        Integer[] arr2 = Arrays.copyOf(arr,6);//数组属于引用数据类型
        Integer[] arr3 = Arrays.copyOfRange(arr,1,3);//注意包头不包尾
        System.out.println(Arrays.toString(arr3));
        System.out.println("判断两个数组的元素是否完全一致：" + Arrays.equals(arr,arr2));

        List<Integer> list = Arrays.asList(arr);//数组变集合
        list.toArray();//集合变数组
        System.out.println(list);
    }
}
