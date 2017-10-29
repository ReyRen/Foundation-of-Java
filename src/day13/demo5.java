package day13;

/**
 * Created by reyren on 2017/2/1.
 */
/*进城：
    正在运行的程序。进程负责了内存空间的划分
   Windows 号称是多任务的操作系统， 那么Windows 是同时运行多个应用程序吗
            单核CPU一个时间片只能执行一个应用程序。CPU是做了一个快速切换的执行动作，速度太快，感觉不到而已
  线程：
    线程在一个进程中负责了代码的执行，就是进城中的执行路径的意思。
  多线程：
    在一个进城中有多个线程在执行不同的任务。
    任何一个java程序，jvm在运行的时候都会创建一个主main线程执行main方法中的所有代码。
    一个java应用程序至少有两个线程一个是主线程负责main方法的执行，一个是垃圾回收器负责了回收垃圾
    与其说是进城争夺CPU资源，不如说是线程抢夺CPU资源
  多线程的好处：
    1.解决了我们一个进城能同时执行多个任务的问题
    2.提高了资源的利用率
  多线程的弊端：
    1.增加了CPU的负担
    2.降低一个进城中线程的执行概率
    3.会引发线程安全问题
    4.出现死锁现象
  如何创建多线程：
    方法一：
        1.自定一个类继承Thread类
        2.重写Thread的Run方法
            每个线程都有自己的任务代码，jvm创建的主线程的任务代码就是main方法中的所有代码，自定义线程的任务代码就写在run方法中，自定义线程负责了run
            方法中的代码
        3.创建Thread的子类方法，并且调用start方法开启线程
            一个线程一旦开启，那么线程就会执行run方法的代码， run方法千万不能直接调用，直接调用run方法就相当于调用了一个普通的方法而已，并没有
            开启新的线程

*
* */
public class demo5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("自定义线程:" + i);
        }
    }

    public static void main(String[] args) {
        demo5 d = new demo5();
       //调动Start方法启用线程
        d.start();
        for (int i = 0; i < 100; i++){
            System.out.println("主线程：" + i);
        }

    }
}
