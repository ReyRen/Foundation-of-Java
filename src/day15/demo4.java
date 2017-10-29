package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by reyren on 2017/2/24.
 */
/*
迭代：
listIterator()

ListIterator特有的方法

    添加：
        hasPrevious()判断是否存在上一个元素
        previous()获取上一个元素,当前指针先向上移动一个单位，再取出当前指针指向的元素，而next是先取出当前指针的元素然后再向下移动
        -----------------------

        add(E e)把当前元素插入到当前指针指向的位置上
        set(E e)替换迭代器最后一次返回的元素

*
*
* */

public class demo4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("狗娃");
        list.add("狗剩");
        list.add("铁蛋");
        list.add("美美");

        ListIterator it = list.listIterator();//返回的是一个List接口中特有的迭代器
        System.out.println("有上一个元素吗？" + it.hasPrevious());//刚取到迭代器的话，指针指向第一个元素
        //System.out.println("获取上一个元素：" + it.previous());

       /* while (it.hasNext()){
            it.next();
        }
        while (it.hasPrevious()){
            System.out.println("元素:" + it.previous());
        }*/

        //it.add("meimei");//在狗娃前面
        it.next();
        it.next();
        it.set("gousheng");//替代狗剩
    }
}
