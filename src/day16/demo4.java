package day16;

import java.util.HashSet;

/**
 * Created by reyren on 2017/2/26.
 */
/*、Set下的实现类
        HasSet
        TreeSet


    HashSet实现原理：
        往HashSet添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值（其实就是内存地址），然后通过元素的哈希值经过移位运算，就可以算出该元素在哈希表中的存储位置
        情况一：如果算出元素的位置目前没有任何的元素存储，那么该元素可以直接存储到该位置上。
        情况二：如果算出该元素的存储位置目前已经存在有其他的元素了，那么还会调用该元素的equals方法与该位置的元素再比较一次，如果equals返回的是TRUE，那么该元素与这个位置
        上的就是重复元素，不允许添加，否则可以添加
        hash表示桶式结构，一个格格能放多个，也就是说一个存储位置可以放多个
*       equals没有重写比较的是内存地址
* */
public class demo4 {
    public static void main(String[] args) {
       /* HashSet set = new HashSet();//实现的是Set接口
        set.add("狗娃");
        set.add("狗剩");
        set.add("铁蛋");
        System.out.println(set);*/
        HashSet set = new HashSet();
        set.add(new Person(110,"狗娃"));
        set.add(new Person(220,"狗剩"));
        set.add(new Person(330,"铁蛋"));
        set.add(new Person(110,"陈大福"));//想要不能添加重复ID的元素进去，就得重新写HashCode方法，这样使得哈希值一样喽

        System.out.println(set);
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
        return "" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                '}';
    }

    //重写Hashcode
    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {

        Person person = (Person) o;

        return this.id == person.id;

    }
}
