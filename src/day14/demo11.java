package day14;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by reyren on 2017/2/14.
 */
/*判断
*       contains(Object o)
 *      containsAll(Collection<> c)如果此collection 包含collection中的所有元素，则返回true
 *      isEmpty()
* */
public class demo11 {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("令计划");
        collection.add("徐才厚");
        collection.add("周永康");
        System.out.println("判断集合是否为空元素" + collection.isEmpty());
        System.out.println("判断集合中是否存在指定的元素" + collection.contains("徐才厚"));*/

        //添加自定义的元素
        Collection collection = new ArrayList();//查看源代码要看实现类的源代码中的方法
        collection.add(new Person(110, "狗娃"));//需要调用new对象的toString方法，所以需要重写，如果不调用toString,一个对象返回的是hashCode
        collection.add(new Person(119, "狗剩"));
        collection.add(new Person(120, "铁蛋"));

        //存在该元素吗
        System.out.println("存在该元素吗？" + collection.contains(new Person(120, "铁蛋")));
        //contains放内部是依赖于equals方法进行比较的，要想一样，就得重新equals方法

        System.out.println("集合的元素" + collection);
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{编 号：" + this.id + " 姓 名：" + this.name + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == p.id;
    }
    //一般重写equals方法，我们都会重新hashCode方法

    @Override
    public int hashCode() {
        return this.id;
    }
}
