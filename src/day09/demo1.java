package day09;

/**
 * Created by reyren on 2016/11/9.
 */
/*final
*   用法：1.修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的
*        2.修饰一个引用类型变量时，该变量不能重新指向新的对象
*        3.修饰一个函数的时候，该函数不能被重写
*        4.修饰一个类的时候，该类不能被继承的
*  常量的修饰符一般为：public static final
* */
public class demo1 extends Circle{
    public static void main(String[] args) {
        /*final Circle c = new Circle(4.0);
        //c.getArea();
        //c = new Circle(5.0);//c指向新的变量
        test(c);*/
        demo1 d = new demo1(4.0);
        d.getArea();

    }
    public static void test(Circle c){
        c = new Circle(5.0);
    }

    public demo1(double r) {
        super(r);
    }

    /*//重写
    public void getArea(){
        System.out.println("猜猜我的面积");
    }*/
}

//圆形
class Circle {
    double r;//半径
    final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public final void getArea(){
        System.out.println("圆形的面积是：" + r*r*pi);
    }
}