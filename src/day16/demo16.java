package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by reyren on 2017/3/2.
 */
/*泛型的上下限：
    需求：定义一个函数可以接收任意类型的集合对象,要求接收的集合对象只能存储Integer或者是Integer的父类类型数据
*
*? super Integer属于泛型的下限
*   需求：定义一个函数可以接收任意类型的集合对象，要求只能存储Number对象和Number的子类类型
* ? extends Number属于泛型的上限
* */

public class demo16 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Number> list2 = new ArrayList<Number>();

        HashSet<String> set = new HashSet<String>();
        //print(set);这样就不行了
    }

    //泛型的下限
    public static void print(Collection<? super Integer> c){//?可以匹配任意的数据类型,这样写表示，我的集合对象不知道存储的是什么数据类型，但是它所存储的数据类型是与Integer和其父类有关系

    }

    //泛型的上限
    public static void print1(Collection<? extends Number> c){//只能存储Number或者是Number类型的子类数据

    }
}
