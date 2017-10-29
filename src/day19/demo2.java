package day19;

import java.util.*;

/**
 * Created by reyren on 2017/3/8.
 */
/*增强for循环：
    简化迭代器的书写格式(注意，增强for循环的底层还是使用迭代器遍历)
    适用范围：
        实现了Iterable接口的对象或者是数组对象都可以使用增强for循环
    增强for循环的格式
        for(变量类型 变量名：遍历的目标){}
    增强for循环注意事项：
        1.底层也是使用迭代器获取的，只不过获取迭代器由jvm完成，不需要我们获取迭代器，所有在使用增强for循环遍历元素的时候不准使用集合对象对集合的元素个数进行修改
        2.迭代器遍历元素与增强for循环遍历元素的区别：
            使用迭代器遍历集合的元素时，可以删除集合的元素，而增强for循环遍历集合的元素是不能调用迭代器的remove方法，添加也不行
        3.普通for循环与增强for循环的区别：
            普通for循环可以没有遍历的目标，而增强for循环一定要有遍历的目标
*       4.map集合没有实现Iterable接口，所以Map集合不能直接使用增强for循环，但是如果需要使用增强for循环，需要借助于Collection的集合遍历
* */

public class demo2 {
    public static void main(String[] args) {
       /* HashSet<String> set = new HashSet<String>();
        set.add("狗娃");
        set.add("狗剩");
        set.add("铁蛋");*/

        /*//使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println("元素:" + it.next());
        }*/

       /* //使用增强for循环解决上面问题
        for (String item:
             set) {
            System.out.println("元素是:" + item);
            //set.remove("狗剩");//ConcurrentModificationException,因为remove的方法必须是迭代器的对象来调用的也就是上面的it可以remove
        }*/

       /*int[] arr = {12, 5, 6, 1};
        *//*for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*//*

        for (int item:
             arr) {
            System.out.println(item);
        }*/
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        map.put("004","赵六");
        Set<Map.Entry<String, String>> entrys = map.entrySet();//将双列集合成了单列集合
        for (Map.Entry<String, String> entry:
             entrys) {
            System.out.println("键:" + entry.getKey() + " 值:" + entry.getValue());
        }
    }
}
