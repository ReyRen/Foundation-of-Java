package day09;

/**
 * Created by reyren on 2016/11/9.
 */
/*存在问题：
    1.没有强制要重写run方法
    2.动物类的run方法描述的不正确
  解决方案：
    我们发现描述一类事物的时候，发现该种事物确实存在着某种行为，但是这种行为目前不是具体的，那么我们可以抽取这种行为的声明，但是
    不去实现这种行为，这时候这种行为我们称为抽象的行为，我们就需要使用抽象类
    (一个函数只要有{}即使具体的函数)
  abstract:
    1.如果一个函数没有方法体，那么该函数必须使用abstract修饰
    2.如果一个类出现了抽象的函数，那么该类也必须使用abstract修饰
    3.如果一个非抽象类继承了抽象类那么必须要把抽象类的所有抽象方法全部实现
    4.抽象类可以存在非抽象的方法
    5.抽象类可以不存在抽象方法
    6.抽象类是不能创建对象的
    7.抽象类是存在构造方法的，其构造函数是提供给子类创建对象的时候初始化父类属性的
*
* */
public class demo2 {
    public static void main(String[] args) {
        Dog d = new Dog("牧羊犬", "棕色");
        d.run();

        Fish f = new Fish("锦鲤鱼", "金黄色");
        f.run();
    }
}
//动物
abstract class Animal{
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /*public void run(){
        System.out.println(name + "四条腿跑的快");
    }*/
    public abstract void run();
}

class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    public void run(){
        System.out.println(name + "四条腿跑的很快");
    }


}

class Fish extends Animal{
    public Fish(String name, String color) {
        super(name, color);
    }
    public void run(){
        System.out.println(name + "游啊游");
    }
}