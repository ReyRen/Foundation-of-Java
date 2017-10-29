package day14;

/**
 * Created by reyren on 2017/2/2.
 */
/*需求：一个银行账户5000块，两夫妻一个拿着存折，一个拿着卡，开始取钱比赛，每次只能取一千块，要求不准出现线程安全问题

同步函数：
    使用synchronized修饰一个函数
同步函数要注意的事项：
    1.如果是一个非静态的同步函数的锁对象时this对象，如果是静态的同步韩式的锁对象时当前函数所属的类的字节码文件（class对象）
    2.同步函数的锁对象时固定的不能由你来指定的
*
* 推荐使用同步代码块：
*   1.同步代码块的锁对象可以由我们随意执行定，同步函数的锁对象时固定的，不能由我们指定
*   2.同步代码块可以很方便控制需要被同步代码的范围，同步函数必须是整个函数的所有代码都被同步了
* */
public class demo1 {
    public static void main(String[] args) {
        //创建两个线程对象
        BankThread thread1 = new BankThread("老公");
        BankThread thread2 = new BankThread("老婆");

        thread1.start();
        thread2.start();
    }
}
class BankThread extends Thread{
    static int count  = 100000;

    public BankThread(String name) {
        super(name);
    }

 /*   @Override
    public void run() {
        while(true){
            synchronized ("锁") {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "取走了1000块，还剩" + (count - 1000));
                    count = count - 1000;
                } else {
                    System.out.println("取光了");
                    break;
                }
            }
        }
    }*/
     @Override
    public synchronized void run() {
        while (true) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "取走了1000块，还剩" + (count - 1000));
                count = count - 1000;
            } else {
                System.out.println("取光了");
                break;
            }
        }
    }
    //静态函数--->函数所属的类的字节码文件---->BankThread.class， 唯一的
    public static synchronized void getMoney(){

    }

}