package day10;

/**
 * Created by reyren on 2016/11/16.
 */
/*
* 内部类：
*   一个类定义在另一个类的内部
* 成员内部类：在类的方法外
*       访问方式1：在外部类提供一个方法创建内部类的对象进行访问
*       访问方式2：在其他类直接创建内部类的对象
*     内部类应用场景：
*       好处：内部类可以直接访问外部类的所有成员
*       应用场景：我们在描述A事物的时候，发现A事物的内部存在一个比较复杂的事物B，这时候B还需要访问到A的属性等数据，这时候我们就可以使用内部类
*     注意细节：
*       1.如果外部类与内部类存在同名的成员变量时，在内部类中在默认情况下是访问内部类的成员变量
*         可以通过外部类.this.成员变量名指定访问外部类的成员
*       2.私有的成员内部类只能在外部类提供一个方法创建内部类对象进行访问，不能在其他类创建对象访问
*       3.成员内部类一旦出现了静态的成员，那么该类也必须使用static 修饰，访问方式outer.inner.x
*
* 局部内部类：在类内的方法内
* */
public class demo3 {
    public static void main(String[] args) {
        /*Outer outer = new Outer();
        outer.instance();*/
        /*Outer.Inner inner = new Outer().new Inner();
        inner.print();*/
        Outer.Inner inner = new Outer.Inner();
    }
}
class Outer{
    //成员变量
    int x = 100;
    //成员内部类
     static class Inner{
         static int x = 10;
        public void print(){
            System.out.println("这个是成员内部类的print方法" + x);
        }
    }
    //在外边类的方法中创建了内部类的对象然后调用内部类的方法
    public void instance(){
        Inner inner = new Inner();
        inner.print();
    }
}
