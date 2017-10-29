package day09;

/**
 * Created by reyren on 2016/11/11.
 */
/*
* 多态的应用场景：
*   1.多态用于形式参数类型时，可以接收更多类型的数据
*       需求：定义一个函数可以接收任意类型的图形对象，并且打印图形的面积与周长
*   2.提高了代码的拓展性
*   3.多态用于返回值类型的时候可以返回更多类型的数据
* */
public class demo10 {
    public static void main(String[] args) {
        /*需求一的运行结果
        Circle3 c = new Circle3(4.0);
        print(c);*/

        MyShape2 m = getShape(1);//调用了使用多态的方法，定义的变量类型要与返回值类型一致
        print(m);
    }
    //需求：定义一个函数可以接收任意类型的图形对象，并且打印图形的面积与周长
    /*public static void print(Circle3 c){

    }
    public static void print(Rect2 r){

    }
    可以用函数的重载实现，但是不好
    */
    public static void print(MyShape2 s){
        s.getArea();
        s.getLength();
    }

    //需求2：定义一个函数可以返回任意类型的图形对象
    public static MyShape2 getShape(int i){
        if (i == 0){
            return new Circle3(4.0);
        }else
            return new Rect2(3,4);
    }
}
abstract class MyShape2{
    public abstract void getArea();

    public abstract void getLength();
}
class Circle3 extends MyShape2{
    public static final double PI = 3.14;
    double r;

    public Circle3(double r) {
        this.r = r;
    }

    public  void getArea(){
        System.out.println("圆形面积" + PI*r*r);
    }

    public  void getLength(){
        System.out.println("圆形的周长" + 2*PI*r);
    }
}
class Rect2 extends MyShape2{
    int width;
    int height;

    public Rect2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public  void getArea(){
        System.out.println("矩形的面积" + width*height);
    }

    public  void getLength(){
        System.out.println("矩形周长" + 2*(width+height));
    }
}

