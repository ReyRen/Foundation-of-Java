package day08;

/**
 * Created by reyren on 2016/11/7.
 */

/*
* 4.创建子类对象时，默认会先调用父类无参的构造函数
*   调用父类的构造方法是可以初始化从父类继承下去的属性
* */
public class demo5 {
    public static void main(String[] args) {
        Zi z = new Zi("大头儿子");
        //z.print();
        System.out.println("name = " + z.name);
    }
}

class Fu{
    int x = 10;
    String name;

    public Fu(String name) {
        this.name = name;
        System.out.println("父类有参的构造方法调用了");
    }

    public Fu() {
        System.out.println("父类无参的构造方法调用了");
    }
}
class Zi extends Fu{
    int x = 20;

    public Zi(String name){
        super(name);//指定调用父类一个参数的构造函数，如果没有这句话才会调用无参的构造函数
    }

    public void print(){
        System.out.println("x1 = " + x);
        System.out.println("x2 = " + super.x);
    }

}