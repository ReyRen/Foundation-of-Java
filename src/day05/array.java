package day05;

/**
 * Created by reyren on 2016/10/25.
 */
/*
    数组：是同一种数据类型数据的集合容器


* 数组中最常见的问题：
*   NullPointException 空指针异常：引用类型（八种以外的所有）变量没有指向任何的对象，而访问了对象的属性或者是调用了对象的方法
* */

/*数组的初始化方式：
    1.动态初始化
        数据类型[] 变量名 = new 数据类型[长度];
    2.静态初始化
        数据类型[] 变量名 = {元素1，元素2，元素3.....};
*
* */


public class array {

    public static void main(String [] args){

        //定义一个数组
        //int[] arr = new int[4];//最多能存储4个数据

        int[] arr = new int[2];
        arr = null;//null让该变量不要引用任何的对象。不要记录任何的内存地址,执行到这一句即使对象使用完毕了
        arr[1] = 10;
        System.out.println(arr[1]);//NullPointException
    }
}
