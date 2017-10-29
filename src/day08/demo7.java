package day08;

/**
 * Created by reyren on 2016/11/7.
 */
/*
*目前的问题：父类的功能无法满足子类的需求
* 方法的重写：
*   子父类出现了同名的函数，这个就是方法的重写
* 方法的重载：在一个类中存在两个或者两个以上的同名函数，称为方法的重载
*
* 重写注意：
*   方法名与形参列表一样
*   方法重写时，子类的权限必须要大于或者等于父类的权限
*   方法重写时，子类的返回值类型必须要小于或等于父类的返回值类型
*   方法重写时，子类抛出的异常类型要小于或等于父类抛出的异常类型
*
* */
public class demo7 {
    public static void main(String[] args) {
        Zi3 z = new Zi3("大头儿子");
        z.eat();
    }
}
class Fu3{
    String name;

    public Fu3(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "吃番薯");
    }
}
class Zi3 extends Fu3{//编译器会自动创建一个无参的狗仔方法在子类中，然后也会自动写上super（）调用父类无参的构造方法，如果没有就报错
    String name;

    public Zi3(String name) {
        super(name);
    }

    public void eat(){
        System.out.println("吃西餐");
    }
}
