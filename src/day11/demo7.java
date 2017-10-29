package day11;

/**
 * Created by reyren on 2016/12/20.
 */
/*
* 模板模式:某类事情的步骤有些是固定的有些事会发生变化的，我们可以为这类事情提供模板代买，从而提高效率
*
* 需求：编写一个计算程序运行时间的模板
*
* 模板模式的步骤：
*   1.先写出解决该类事情其中的一件的代解决方案。
*   2.分析代码，把未发生变化的代码抽取出来独立成一个方法.把该方法也描述成一个抽象的方法
*   3.使用final修饰模板方法，防止别人重写
*
* */
public class demo7 extends MyRunTime{
    public static void main(String[] args) {
        demo7 d = new demo7();
        d.getTime();
    }
    //code方法内部就写要计算运行时间的代码
    public  void code(){
        int i = 0;
        while (i < 100){
            System.out.println("i=" + i);
            i++;
        }
    }
}
abstract class MyRunTime{
    public final void getTime(){
        //记录开始的时间
        long startTime = System.currentTimeMillis();
        code();
        /*for (int i = 0; i < 100; i++){
            System.out.println(i);
        }*/
        long endTime = System.currentTimeMillis();//结束时间
        System.out.println("运行时间是：" + (endTime-startTime));
    }

    public abstract void code();
}

