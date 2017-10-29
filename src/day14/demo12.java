package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by reyren on 2017/2/14.
 */
/*  迭代
*       toArray()
*       iterator()
* */
public class demo12 {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("令计划");
        collection.add("徐才厚");
        collection.add("周永康");

        Object[] arr = collection.toArray();//把集合中的元素全部返回到一个Object的数组中返回。

        System.out.println("数组的元素:" + Arrays.toString(arr));
*/
        Collection collection = new ArrayList();
        collection.add(new Person(110, "狗娃"));
        collection.add(new Person(119, "狗剩"));
        collection.add(new Person(120, "铁蛋"));

        Object[] arr = collection.toArray();
        //需求：把编号是110的信息
        for (int i = 0; i < arr.length; i++){
            Person p = (Person) arr[i];//从Object数组中取出的元素只能使用Object类型声明变量接收，如果需要其他类型就需要强制类型转换
            if (p.id == 110){
                System.out.println(p.name);
            }
        }
    }
}
