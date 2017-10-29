package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by reyren on 2017/2/13.
 */
/*集合：集合是存储对象数据的集合容器
*
* 集合比数组的有势:
*   1.集合能存储任意类型的数据，数组只能存储统一种数据类型的数据
*   2.集合的长度是会发生变化的，数组的长度是固定的
*
*
* -----| Collection 单例集合的根接口
* ---------| List 如果是实现了list接口的集合类，具备的特点是：有序，可重复
* ---------| Set  如果是实现了set接口的集合类，具备的特点是：无序，不可重复
*
*
* 对方法进行分类：
*   增加
*       add（E e）添加成功返回true,添加失败返回false
*       addAll(Collection<Object> c) 把一个集合的元素添加到另外一个集合中去
*
*
*   删除
*       clear()清空集合中的元素
*       remove(Object o)//指定集合中的元素删除，删除成功返回true,删除失败返回false
*       removeAll(Collection<> c)删除两个集合中的交集元素
*       retainAll(collection<> c)保留交集元素，其他元素删除掉
*
*   查看
*       size()查看元素的个数
*
*   判断
*       contains(Object o)
 *      containsAll(Collection<> c)
 *      isEmpty()
*   迭代
*       toArray()
*       iterator()
* */

public class demo10 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();//多态
        collection.add("abc");
        collection.add(1);
        collection.add(3.14);
        collection.add("令计划");
        System.out.println("添加成功吗？" + collection.add("郭美美"));
        System.out.println("集合的元素是：" + collection);

        /*//创建集合
        Collection collection1 = new ArrayList();
        collection1.add("王林");
        collection1.add("房租民");
        collection1.add("郭美美");

        collection1.removeAll(collection2);

        collection.addAll(collection1);//把c2集合中的元素，添加到c1中去
        System.out.println("集合的元素是：" + collection);*/

        /*//删除的方法：
        //collection.clear();
        System.out.println("删除成功吗？ " + collection.remove("郭美美"));
        System.out.println("集合的元素是：" + collection);*/

        System.out.println("集合的元素个数是:" + collection.size());
    }
}
