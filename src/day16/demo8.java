package day16;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by reyren on 2017/2/28.
 */
/*TreeSet添加自定义元素
注意事项：
    1.往TreeSet添加元素多额时候，如果元素本身具备自然顺序的特性，那么就按照自然顺序的特性进行排序存储
    2.往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素的比较规则定义在CompareTo(T t)方法上
*   3.如果比较元素的时候CompareTo方法返回的是0，那么该元素就被视为重复元素不允许添加（TreeSet与Hashcode没有任何联系的）
*   4.往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，而元素所属的类也没有实现Comparable接口，那么必须要创建TreeSet的时候传入一个比较器
*
*     如何自定义比较器：自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可
*       格式：class 类名 implements Comparator{
*
*           }
*   推荐使用比较器，即compartor
*
*   5.往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而所属元素的类已经实现了Comparable接口,在创建TreeSet对象的时候传入了比较器那么是以比较器的比较规则进行比较的
*   6.TreeSet是可以对字符串进行排序的，因为我们的字符串已经实现了Comparable接口
* */

public class demo8 {
    public static void main(String[] args) {
        //创建一个比较器对象
        myComparator comparator = new myComparator();
        //创建TreeSet的时候传入比较器

        TreeSet tree = new TreeSet(comparator);
        tree.add(new Emp(113, "老钟", 200));
        tree.add(new Emp(110, "老陆", 100));
        tree.add(new Emp(220, "老汤", 300));
        tree.add(new Emp(120, "老蔡", 500));



        System.out.println("集合的元素:" + tree);
    }
}
/*
class Emp implements Comparable{
    int id;
    String name;
    int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{编号：" +
                this.id +
                ", 姓名='" + this.name +
                ", 薪水=" + this.salary +
                '}';
    }

    @Override //元素与元素之间的比较规则定义于此
    //返回值：负整数，零，和正整数，根据次对象是小于，等于还是大于指定对象
    public int compareTo(Object o) {
        Emp e = (Emp)o;
        System.out.println(this.name + " compare " + e.name);
        return this.salary-e.salary;

    }
    */
/*比较结果：
    老钟compare老钟
    老陆compare老钟
    老汤compare老钟
    老蔡compare老钟
    老蔡compare老汤
    *
    * 采用的是二叉树的方式进行比较的
    * *//*

}*/

class Emp {
    int id;
    String name;
    int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{编号：" +
                this.id +
                ", 姓名='" + this.name +
                ", 薪水=" + this.salary +
                '}';
    }
}
//自定义比较器类，根据第一个参数小于，等于或大于第二个参数分别返回负整数，0和正整数
class myComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp)o1;
        Emp e2 = (Emp)o2;
        return e1.id-e2.id;
    }
}