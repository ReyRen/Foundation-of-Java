package day08;

/**
 * Created by reyren on 2016/11/7.
 */

/*super:
    代表了父类空间的引用（在子类对象中，也就是子类对象所开辟的堆内存中有专门一块内存区是专门继承父类的属性的）
  super关键字的作用：
    1.子父类存在着同名的成员时，在子类中默认是访问子类的成员，可以通过super访问父类的成员
    2.创建子类对象时，默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法
  注意事项：
    1.如果在子类的构造方法上没有指定调用父类的构造方法，那么java编译器会在子类的构造方法上加上super();
    2.super关键字调用父类的构造函数时，该语句必须是子类构造函数中的第一个语句
    3.super与this关键字，不能同时出现在同一个构造函数中调用其他的构造函数因为两个语句都需要第一个语句
  super和this的区别：
    1.代表的事物不一致
        super代表的是父类空间的引用。
        this关键字代表的是所属行数的调用者对象
    2.使用前提不一样
        super必须有继承关系才使用
        this关键字不需要继承关系
    3.调用构造函数的区别
        super关键字调用的是父类的构造函数
        this关键字调用本类的构造函数
*
* */
public class demo6 {
    public static void main(String[] args) {
        Zi2 z = new Zi2("狗娃");
       // z.print();
    }
}
class Fu2{
    int x = 10;

    String name;

    public Fu2() {
        System.out.println("父类无参的构造方法");
    }

    public Fu2(String name) {
        this.name = name;
        System.out.println("父类有参的构造方法");
    }

    public void eat(){
        System.out.println("小头爸爸吃番薯");
    }
}
class Zi2 extends Fu2{
    int x = 20;

    public Zi2(String name){
        //this();//调用本类无参的构造方法
        super(name);//指定调用了父类带参的构造方法
        //super//指定调用了父类无参的构造方法
    }

    public Zi2(){
        System.out.println("Zi类无参的构造方法");
    }

    public void eat(){
        System.out.println("大头爸爸吃番薯");
    }

    public void print(){
        //eat();//子类的eat方法
        super.eat();
        System.out.println("x = " + super.x);
    }
}