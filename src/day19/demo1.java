package day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by reyren on 2017/3/7.
 */
/*静态导入：
    简化书写
    格式：
        import static 包名.类名.静态的成员
    静态导入可以作用于一个类的所有静态成员
 静态导入需注意的事项：
    1.如果出现同名的，那么会调用本类的方法，如果本类的方法与调用的参数不符，就会报错，如果需要制定使用静态导入的成员变量，那么西药在静态成员前民加上类名
* */

import static java.util.Collections.max;
import static java.util.Collections.sort;
import static java.util.Collections.binarySearch;

import static java.lang.System.out;
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(13);
        list.add(9);
        list.add(10);
        list.add(19);

        //排序
        //Collections.sort(list);
        sort(list);
        System.out.println("集合元素是:" + list);
        //System.out.println("索引值：" + Collections.binarySearch(list,13));
        System.out.println("索引值：" + binarySearch(list,13));
        System.out.println("最大值:" + max(list));
        out.print("hello");
    }
    public static void sort(ArrayList<Integer> list){
        System.out.println("本类的sort方法....");
    }
}
