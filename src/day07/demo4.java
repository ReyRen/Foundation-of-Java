package day07;

/**
 * Created by reyren on 2016/11/4.
 */
/*this关键字调用其他的构造函数要注意的事项：
    1.this关键字调用其他的构造函数时，this关键字必须位于构造函数中的第一个语句
*   2.this关键字在构造函数中不能出现相互调用，因为是个死循环
* */

public class demo4 {
    public static void main(String[] args) {
        Student s = new Student(110,"铁蛋");
        System.out.println("编号 " + s.id + "名字 " + s.name);
        Student s2 = new Student("金胖子");
        System.out.println("名字 " + s2.name);
    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this(name);//调用了本类的一个参数的构造方法
        this.id = id;//加上this表示的就是成员边来那个的id和name了
        //this.name = name;

    }
    public Student(String name){
        this.name  = name;
        System.out.println("一个参数的构造方法被调用了");
    }
}