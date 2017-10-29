package day09;

/**
 * Created by reyren on 2016/11/9.
 */

/*需求：描述一个图形，圆形，矩形三个类，不管哪种图形都会具备计算面积与周长的行为，只不过每种图形计算方式不一样

abstract不能与以下关键字共同修饰一个方法：
    1.private，
    2.static，别人就能类名.函数,但是这个函数是抽象函数，没有意义
    3.final
* */
public class demo3 {
    public static void main(String[] args) {
        Circle2 c = new Circle2("圆形",4.0);
        c.getArea();
        c.getLength();
    }
}
//图形类
abstract class MyShape{
    String name;

    public MyShape(String name) {
        this.name = name;
    }

    public abstract void getArea();
    public abstract void getLength();
}
//圆形
class Circle2 extends MyShape{
    double r;
    public static final double PI = 3.14;//常量命名：全部大写，单词与单词之间使用下划线分割

    public Circle2(String name, double r) {
        super(name);
        this.r = r;
    }

    public  void getArea(){
        System.out.println(name + "的面积是" + PI*r*r);
    }
    public  void getLength(){
        System.out.println(name + "的周长是" + 2*PI*r);
    }
}
//矩形
class Rect extends MyShape{
    int width;
    int height;

    public Rect(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public  void getArea(){
        System.out.println(name + "的面积是" + width*height);
    }
    public  void getLength(){
        System.out.println(name + "的周长是" + 2*(width+height));
    }
}

