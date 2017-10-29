package day17;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collector;

/**
 * Created by reyren on 2017/3/4.
 */
/*TreeMap
    也是基于红黑树（二叉树）数据结构实现的。会对元素的键进行排序存储
    注意的事项：
        1.往treeMap添加元素的时候如果元素的键具备自然顺序，就会按照键的自然顺序特性进行排序存储
        2.如果添加的元素不具备自然顺序的特性，那么键所属的类必须要实现Comparable接口，把键的比较规则定义在compareTo方法上
        3.如果添加的元素不具备自然顺序的特性,而且键所属的类也没有实现Comparable接口，那么久必须在创建treeMap对象的时候传入比较器
*
*
* */

public class demo4 {
    public static void main(String[] args) {
        /*TreeMap<Character,Integer> tree = new TreeMap<Character,Integer>();
        tree.put('c',10);
        tree.put('b',2);
        tree.put('a',5);
        tree.put('h',12);
        System.out.println(tree);*/

        //创建一个自定义的比较器
        Mycomparator comparator = new Mycomparator();
        TreeMap<Emp, String> tree = new TreeMap<Emp,String>(comparator);

        //TreeMap<Emp, String> tree = new TreeMap<Emp,String>();
        tree.put(new Emp("冰冰",2000),"001");
        tree.put(new Emp("家宝",1000),"002");
        tree.put(new Emp("习总",3000),"003");
        tree.put(new Emp("克强",5000),"004");
        System.out.println(tree);//报错，原因是元素是不具备自然顺序的
    }
}
class Emp implements Comparable{
    String name;
    int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名='" + this.name  +
                ", 薪水=" + this.salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Emp e = (Emp)o;
        return this.salary-e.salary;
    }
}
//自定义比较器
class Mycomparator implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.salary-o2.salary;
    }
}