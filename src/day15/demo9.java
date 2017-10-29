package day15;

import javafx.beans.binding.ObjectExpression;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by reyren on 2017/2/25.
 */
/*LinkedList的实现原理：
    是用链表数据结构实现的，每个数据都分成两部分，一个是张三，另一个是下个元素的内存地址
    特点：查询速度慢，增删快
    不是用Object数组实现的，所以地址和地址之间并不是连续的
    增加的时候只需要把相差入的位置前后的元素的内存地址改了，就行了
    删除的时候同理

 LinkedList特有的方法：
    1.方法介绍：
        addFirst(E e)
        addLast(E e)
        getFirst()
        getLast()
        removeFirst()
        removeLast()
    2.数据结构
        1.栈 :主要用于实现堆栈数据结构的存储方式
            先进后出
            push（）
            pop()
        2.队列 :为了让你们可以使用LinkedList模拟队列数据结构的存储方式
            先进先出
            offer（）
            poll（）
        3.返回逆序的迭代器对象
            descendingIterator()返回逆序的迭代器对象

 机试：使用LinkedList实现堆栈数据结构的存储方式与队列的数据的存储方式


*
* */
//使用LinkedList模拟堆栈的数据结构存储方式
class StackList{
    LinkedList list;
    public StackList(){
        list = new LinkedList();//这样写能够在new StackList对象的时候直接new出LinkedList
    }
    //进栈
    public void add(Object o){
        list.push(o);
    }
    //出栈或弹栈(把该元素删除，并且把该元素返回)
    public Object pop(){
        return list.pop();
    }
    //获取元素个数
    public int size(){
        return list.size();
    }
}
//使用LinkedList模拟队列的存储方式
class TeamList{
    LinkedList list;

    public TeamList(){
        list = new LinkedList();
    }

    public void add(Object o){
        list.offer(o);
    }

    public Object remove(){
        return list.poll();
    }

    //获取元素个数
    public int size(){
        return list.size();
    }
}






public class demo9 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        /*list.addFirst("狗娃");//把元素添加到集合的首位上
        list.addLast("美美");//把元素添加到集合的末尾处*/

        //System.out.println("获取集合中首位置的元素" + list.getFirst());

        /*System.out.println("删除集合中的首位置元素并且返回：" + list.removeFirst());
        System.out.println("删除集合中末尾元素并且返回：" + list.removeLast());*/

       /* list.push("狗娃");//将元素插入到集合的开头处
        System.out.println(list.pop());//移除并返回列表中的第一个元素

        list.offer("狗剩");//将元素添加到集合末尾处
        System.out.println(list.poll());//移除集合中的第一个元素*/

       //逆序的迭代器
        Iterator it = list.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(list);

        /*StackList list = new StackList();
        list.add("李嘉诚");
        list.add("马云");
        list.add("王健林");
        int size = list.size();
        for (int i = 0; i < size; i++){
            System.out.println(list);
        }*/
    }
}
