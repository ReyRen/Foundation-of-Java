package day06;

/**
 * Created by reyren on 2016/10/29.
 */

/*自定义类的三步骤：
    1.自定义类。
    2.通过类创建对象
    3.访问对象的属性或者调用对象的功能


  需求：使用java描述一个汽车类，汽车具有轮子数，名字，颜色三个属性，还具备跑的功能
*
* */
public class Class {

    public static void main(String[] args){

    //使用了一个Car类申明了一个c变量，c变量指向了一个车对象String c = ...这个String就是Sun公司写的一个类
        Car c = new Car();
        c.name = "BMW";
        c.color = "白色";
        c.wheel = 4;
        //访问车对象的属性值
        System.out.print("名字" + c.name + " 颜色" + c.color + " 轮子数" + c.wheel);
        c.run();
    }
}

class Car{
    //事物的公共属性使用成员变量描述
    String name;//名字属性
    String color;//颜色属性
    int wheel;//轮子属性

    //事物的公共行为使用函数描述。
    public void run(){
        System.out.print("飞快的跑起来了");
    }
}
