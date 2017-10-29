package day09;

/**
 * Created by reyren on 2016/11/10.
 */
/*一个类最多只能由一个直接的父类，但是可以有对个间接的父类
java是单继承的

接口：为了拓展功能的
定义格式：interface 接口名{}
注意事项：
    1.接口是一个特殊的类
    2.接口的成员变量默认的修饰符为public static final，也就是说接口中的成员变量都是常量
    3.接口中的方法都是抽象的方法，默认修饰符public abstract
    4.接口是不能创建对象的
    5.接口是没有构造方法的
    6.接口是给类去实现使用的，非抽象类实现一个接口的时候，必须将接口中的全部方法全部实现
*
* */
public class demo5 implements A{//实现了A接口
    public static void main(String[] args) {
        demo5 d = new demo5();
        d.print();
    }

    //实现接口中的方法
    public void print(){
        System.out.println("这个是接口中的print方法");
    }
}
interface A{
    //成员变量
    public static final int I = 10;
    //成员方法
    public abstract void print();


}