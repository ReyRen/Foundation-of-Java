package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reyren on 2017/2/24.
 */
/*集合体系
  ---------------| Collection 单列集合的根接口
  -------------------|List 如果是实现了List接口的集合类，该集合的特点是有序，可重复
  -------------------|Set  如果是实现了set实现的集合类，该集合类具备的特点是无序不可重复

  集合中的有序，不是指自然顺序而是指添加进去的顺序与元素出来的顺序是一致的
*
*List接口中特有的方法：
*
*       添加：
*           add(int index, E element )指定索引值，把元素添加到集合中的索引位置上
*           addAll(int index, Collection<? extends E> c)
*       获取：
*           get(int index)
*           indexOf(Object o)找出指定元素第一次出现在集合中的索引值
*           lastIndexOf(Object o)找出指定元素最后一次出现在集合中的索引值
*           subList(int fromIndex, int toIndex)指定开始与结束的索引值，截取集合中的元素
*       修改
*           set(int index, E element)使用指定的元素替换指定索引值的位置上
*       迭代
*           listIterator()
*
*
*List接口特有的特点：操作的方法都存在索引值，只有list接口下面的集合才具有索引值，其他接口下面的集合类都没有索引值
* */
public class demo3 {
    public static void main(String[] args) {
        List list = new ArrayList();//因为List是接口，所以只能实现底线的实现类
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("赵六");//都是把元素添加到末尾处

        /*添加
        list.add(1,"赵本山");
        * */
       /* List list1 = new ArrayList();
        list1.add("本山");
        list1.add("小沈阳");
        list.addAll(2,list1);//把list1的元素添加到list中指定索引值得位置上*/

        /*获取
        System.out.println("get方法获取元素：" + list.get(2));;//根据索引值获取集合中的元素

        //用get方法遍历集合的元素
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }*/
        /*获取
        System.out.println(list.indexOf("本山"));
        System.out.println(list.lastIndexOf("赵六"));
        List sublist = list.subList(1,4);
        System.out.println("子集合的元素是：" + sublist);*/

        /*修改
        list.set(3,"本山");*/


        System.out.println("集合的元素:" + list);
    }
}
