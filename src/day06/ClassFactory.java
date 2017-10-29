package day06;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by reyren on 2016/10/31.
 */

/*需求：使用java描述一个车与修车厂两个事物
        车：公共属性：轮子数，名字，颜色
            公共行为：跑
                    跑之前要检测轮子数是否少于4个，如果少于了4个，要送到修车厂修理，修车厂修理后，车的轮子数要补回来四个，然后继续跑
        修车厂：公共属性：名字，地址，电话
        公共行为：修车
*
* */


public class ClassFactory {

    public static void main(String[] args){
        Car_2 c = new Car_2();

        c.name = "陆丰";

        c.color = "黑色";

        c.wheel = 4;

        c.run();

        c.wheel = 3;

        c.run();

        CarFactory f = new CarFactory();

        f.name = "阿强修车厂";
        f.address = "运泰商业广场一楼";
        f.tel = "020-1234567";
        c = f.repair(c);
        c.run();

    }
}

//车类
class Car_2{
    String name;
    String color;
    int wheel;

    public void run(){
        if (wheel >= 4){
            System.out.print(name + "飞快的跑起来");
        }else {
            System.out.print(name + "不够四个轮子，赶快去修");
        }
    }
}

//修车厂
class CarFactory{

    String name;
    String address;
    String tel;

    public Car_2 repair(Car_2 c){//不能通过New来，因为，每次修车都相当于重新分配内存空间了，应该直接把车扔进去
        if (c.wheel >= 4){
            System.out.print("告诉你，废了很大力气修好了");
        }else{
            c.wheel = 4;
            System.out.print("修好了");
        }
        return c;

    }
}
