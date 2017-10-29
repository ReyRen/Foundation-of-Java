package day10;

/**
 * Created by reyren on 2016/12/4.
 */

/*匿名内部类：没有类名的类
匿名内部类的好处:简化书写
匿名内部类的使用前提:必须存在继承或者实现关系
*
* */
public class demo5 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.print();
    }
}

abstract class Animal{
    //public abstract Animal run();
    public abstract void run();
    public abstract void sleep();
}

class Outer3{
    public void print(){
        //需求：在方法内部定义一个类继承Animal类，然后调用run方法
        //局部内部类做法
        /*class Dog extends Animal{
            public void run(){
                System.out.println("狗在跑");
            }
        }
        Dog d = new Dog();
        d.run();*/
        //匿名内部类做法
        /*new Animal(){//此时匿名内部类与Animal是继承的关系，jvm帮你搞定了
            public Animal run(){
                System.out.println("狗在跑");
                return this;//返回了一个当前对象
            }
            public void sleep(){
                System.out.println("狗在睡觉");
            }
            //特有的方法
            public void bite(){
                System.out.println("狗在咬人");
            }
        }.run().sleep();*/
        Animal a = new Animal(){//多态：父类的引用类型变量指向了子类的引用类型变量，后面那个还是子类继承的父类的只是没有名字的引用类型
            public void run(){
                System.out.println("狗在跑");
                //return this;//返回了一个当前对象
            }
            public void sleep(){
                System.out.println("狗在睡觉");
            }
            //特有的方法
            public void bite(){
                System.out.println("狗在咬人");//如果想要调用特有的方法，就只能用局部内部类去解决了
            }
        };
        a.run();
        a.sleep();
    }
}