package day14;

/**
 * Created by reyren on 2017/2/11.
 */
/*
*
* */
//卖票系统
public class demo4 implements Runnable{
    public static void main(String[] args) {
        demo4 demo4 = new demo4();
        //创建三个线程对象，模拟三个窗口

        Thread thread1 = new Thread(demo4, "窗口1");
        Thread thread2 = new Thread(demo4, "窗口2");
        Thread thread3 = new Thread(demo4, "窗口3");

        thread1.start();;
        thread2.start();
        thread3.start();
    }
     int num = 50;//票数,不需要共享，因为我只有一个Runable对象

    @Override
    public void run() {
        while (true){
            synchronized ("锁"){
                if (num > 0){
                    System.out.println(Thread.currentThread().getName() + "售出了第" + num + "号票");
                    num--;
                }else {
                    System.out.println("售罄了");
                    break;
                }
            }
        }
    }
}
