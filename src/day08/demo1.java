package day08;

/**
 * Created by reyren on 2016/11/4.
 */
/*
*面函数详解：
*   public ：为了保证jvm在任何情况下都能访问到main方法
*   static:  静态可以让jvm在调用main函数的时候更加的方便，不需要通过对象调用
*            jvm不知道如何创建对象，因为创建对象时有时需要参数，不知道传递什么参数。
*   void：   返回值给JVM，但JVM拿这个数据是没有意义的
*   arguments: 参数，担心某些程序在启动的时候需要参数，但很少用args来输入数据
* */
public class demo1 {
    public static void main(String[] args) {


    }
}
