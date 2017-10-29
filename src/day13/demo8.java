package day13;

/**
 * Created by reyren on 2017/2/2.
 */
/*模拟三个窗口同时在售50张票

目前出现了线程安全问题：
    出现线程安全问题的原因：
        1.存在两个或两个以上的线程对象，而且线程之间共享着一个资源
        2.有多个语句操作了共享资源
解决方案：
    SUN提供了同步机制让我们解决这类问题的
    java线程同步机制的方式：
        1.同步代码块儿
            synchronize(锁对象){
                需要被同步的代码
            }

            1.锁对象可以是任意的一个对象
            2.在同步代码块中调用的sleep方法并不会释放锁对象的
            3.同步代码块只有真正存在线程安全问题的时候才使用同步代码块，否则会降低效率的
            4.多线程操作的对象必须是唯一共享的，否则无效
        2.同步函数
*
* */
public class demo8 {
    public static void main(String[] args) {
        //创建三个线程对象，模拟三个窗口
        saleTicket thread1 = new saleTicket("窗口1");
        saleTicket thread2 = new saleTicket("窗口2");
        saleTicket thread3 = new saleTicket("窗口2");
        //开启线程售票
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class saleTicket extends Thread{
    //创建任意的一个对象
    static Object o = new Object();

    //票数
    static int num = 50;//票数，非静态的成员变量在每个对象中都会存一份的
    public saleTicket(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (o) {//一个线程一进来马上就把锁关闭了，一旦出了同步代码块，就显示成开
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出了" + num + "号票");
                    num--;
                } else {
                    System.out.println("售罄了。。。");
                    break;
                }
            }
        }
    }
}