package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by reyren on 2017/2/14.
 */
/*iterator()迭代器

作用：抓取集合中的元素

方法：
    hashNext()问是否有元素继续遍历，如果有元素可以遍历，返回true,否则返回false
    next()取出元素
    void remove()移除迭代器最后返回的元素
* */

public class demo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("狗娃");
        collection.add("狗剩");
        collection.add("铁蛋");
        collection.add("美美");

       /* //遍历集合的元素--->方式1.可以使用toArray的方法
        Object[] arr = collection.toArray();//把集合的元素存储到一个Obj的数组中返回
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }*/

       /*//使用迭代器遍历
        Iterator iterator = collection.iterator();//返回一个迭代器，虽然看似返回的是接口类型，但是真正返回的是这个接口的实现类对象（多态）

        System.out.println("有元素可以遍历吗？" + iterator.hasNext());
        //System.out.println("获取元素:" + iterator.next());
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }*/

       Iterator iterator = collection.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();//[狗娃, 铁蛋, 美美],迭代器跌带到哪里删除哪里，然后完了返回集合的时候就没有这个元素了
        System.out.println(collection);
    }
}
