package day09;

/**
 * Created by reyren on 2016/11/11.
 */
/*需求：在现实生活中有部分同学在学校期间只会学习，但是有部分学生除了学习还会赚钱（拓展的功能就定义在接口上）
* */
public class demo7 {
    public static void main(String[] args) {
        Student s = new Student("狗蛋");
        s.study();
        MoneyStudent ms = new MoneyStudent("二蛋");
        ms.study();
        ms.makeMoney();

    }
}
//普通学生类
class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(name + "好好学习");
    }
}

//接口
//挣钱是学生拓展的功能，所以应该定义在接口上
interface Money{
    public abstract void makeMoney();
}

//会挣钱的学生
class MoneyStudent extends Student implements Money{
    public MoneyStudent(String name) {
        super(name);
    }

    public void makeMoney(){
        System.out.println(name + "赚钱");
    }
}
