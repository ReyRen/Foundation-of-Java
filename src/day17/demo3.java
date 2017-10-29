package day17;

import java.util.HashMap;

/**
 * Created by reyren on 2017/3/4.
 */
/*
* Map集合的实现类：
*   HashMap底层也是基于hash表实现的
*       存储原理：往hashMap添加元素的时候，首先会调用键的hashCode方法的到元素的hash码值，经过运算算出该元素在hash表中的存储位置
*               情况一：如果算出的位置，目前没有任何元素存储，那么该元素能够直接存储在hash表中
*               情况二：如果算出的位置目前已经存在了其他的元素，那么还会调用该元素的equals方法与这个位置上的元素惊醒比较
*                       如果equals方法返回的是false，那么该元素允许被存储，如果是true,那么该元素被视为重复元素，不允许存储
 *
 *
 **/

public class demo3 {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person(110, "狗娃"), "001");
        map.put(new Person(220, "狗剩"), "002");
        map.put(new Person(330, "铁蛋"), "003");
        map.put(new Person(110, "狗娃"), "007");//如果出现了相同的键，后添加的值会取代之前的值
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
        return "{" +
                "编号=" + this.id +
                ", 姓名='" + this.name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person)o;
        return this.id == p.id;

    }

    @Override
    public int hashCode() {
        return this.id;
    }
}