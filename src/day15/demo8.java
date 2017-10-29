package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by reyren on 2017/2/25.
 */
/*需求：编写程序清楚集合中的重复元素，如果书号一样，就是重复的，必须使用迭代器遍历
*
* */
public class demo8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book(110,"java编程思想"));
        list.add(new Book(220,"java核心技术"));
        list.add(new Book(330,"深入javaWeb"));
        list.add(new Book(110,"java神书"));

        ArrayList list2 = clearRepeat(list);
        System.out.println("新集合的元素是: " + list2);
    }

    public static ArrayList clearRepeat(ArrayList list){
        //创建一个新的集合
        ArrayList newList = new ArrayList();
        //获取迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();//从旧的集合中获取的元素
            if (!newList.contains(book)){//需要重写ccontains中的equals放法
                //如果新集合没有包含这本书，就添加到新集合中
                newList.add(book);
            }
        }
        return newList;
    }
}
class Book{
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
