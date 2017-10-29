package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by reyren on 2017/2/25.
 */
/*迭代器遍历元素的时候要注意的事项：

*在迭代器迭代元素的过程中，不允许使用集合对象改变集合中的元素个数，如果需要增加或者删除，只能使用迭代器的方法进行操作
*
* 迭代器迭代的过程：就是开始执行迭代器的方法，开始遍历的时候开始
* */
public class demo6 {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        ListIterator it = list.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + ",");
            //it.add("aa");//把元素添加到当前指针指向的位置,但是迭代没有遍历出aa是因为Arraylist中的add方法是每加入aa，不仅加入了aa，而且指针还会向下移动一个
            list.add("aa");//将aa直接加在了数组的末尾，这样游标会向下走，但是下面没有了，所以直接报错java.util.ConcurrentModificationException
        }
        System.out.println("\r\n" + list);
    }
}
