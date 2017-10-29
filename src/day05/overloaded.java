package day05;

/**
 * Created by reyren on 2016/10/21.
 */

/*注意：如果一个函数的返回值数据类型是具体的数据类型，那么该函数必须保证在任何的情况下都有返回值

return关键字的作用：
    1.返回数据给函数的调用者
    2.函数一旦执行到了return，那么该函数马上结束（能结束一个函数）
*
* */

/*
* 1.定义一个函数做加法功能
*
* 函数重载的要求：
*   1.函数名一致
*   2.形参列表不一致（形式参数的个数或者是对应的数据类型不一致）
*           double a, int b和int a, double b也是可以的
*   3.和返回值类型是没有关系的
* */

public class overloaded {

    public static void main(String[] args){

        add(1,2);
        add(1,2,3);

    }

    public static void add(int a, int b){
        System.out.println("两个参数的总和是：" + (a+b));
    }
    public static void add(int a, int b, int c){
        System.out.println("三个参数的总和是：" + (a+b+c));
    }
    public static void add(int a, int b, int c, int d){
        System.out.println("四个参数的总和是：" + (a+b+c+d));
    }
}
