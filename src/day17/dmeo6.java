package day17;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by reyren on 2017/3/4.
 */
/*集合的工具类：（collections）
*Collection与Collections的区别：
*   Collection是单列集合的根接口，Collections是操作集合的工具类
*
*Collections常见方法：
*   1.对List进行二分查找(前提该集合一定要有序)
*       int binarySearch(list,key);
*       int binarySearch(list, key, Comparator)
*   2.对list集合进行排序
*       sort(list)； 如果存储的是不具有自然顺序的集合，那么排序需要传入比较器
*       sort（list，comaprator）;
*   3.对集合取最大值和最小值
*       max(Collection)
*       max(Collection,comparator)
*       min(Collection)
*       min(Collection,comparator)
*   4.对list集合进行反转
*       reverse(list)
*   5.可以将不同的集合编程同步的概念
*       Set synchronizedSet(Set<T> s)
*       Map synchronizedMap(Map<K,V> m)
*       List synchronizedList(List<T> list)
*
* */

public class dmeo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(19);

        Collections.sort(list);
        System.out.println("元素所在的索引值是:" + Collections.binarySearch(list,12));

        System.out.println("最大值：" + Collections.max(list));
        System.out.println("最小值：" + Collections.min(list));

        Collections.reverse(list);//就变成降序，反转是不需要比较过程的，并不是非要排序才反转

        System.out.println(list);

        list = (ArrayList<Integer>) Collections.synchronizedList(list);//会返回一个线程安全的集合对象

    }
}
