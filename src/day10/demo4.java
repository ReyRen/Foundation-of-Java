package day10;

/**
 * Created by reyren on 2016/11/16.
 */
/*局部内部类：
    在一个类的方法内部定义另外一个类，那么另外一个类就作为局部内部类

  局部内部类注意细节：
    1.如果局部内部类访问了一个局部变量，那么该局部变量必须用final修饰
*
* */
public class demo4 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
class Outer2{
    public void test(){
        //局部变量
        final int y = 100;
        //局部内部类
        class Inner2{
            int x = 10;
            public void print(){
                System.out.println("这个是局部内部类的print方法" + y);
            }
        }
        Inner2 inner  = new Inner2();
        inner.print();
    }
}