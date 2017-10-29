package day14;

/**
 * Created by reyren on 2017/2/3.
 */
/*java中的同步机制解决了线程安全问题，但是也同时引发了死锁现象
*
* 死锁现象的根本原因：
*   1.存在两个或两个以上的线程
*   2.存在两个或者两个以上的共享资源
*
* 死锁的解决方案：
*   没有解决的方案，只能尽量的避免
* */
public class demo2{
    public static void main(String[] args) {
        Deadlock thread1 = new Deadlock("张三");
        Deadlock thread2 = new Deadlock("李四");

        //开启线程
        thread1.start();
        thread2.start();

    }

}
class Deadlock extends Thread{
    @Override
    public void run() {
        if ("张三".equals(Thread.currentThread().getName())){
            synchronized ("遥控器"){
                System.out.println("张三拿到了遥控器，准备去拿电池");
                synchronized ("电池"){
                    System.out.println("张三拿到了遥控器和电池了");
                }
            }
        }else if ("李四".equals(Thread.currentThread().getName())){
            synchronized ("电池"){
                System.out.println("李四拿到了电池，准备去拿遥控器");
                synchronized ("遥控器"){
                    System.out.println("张三拿到了遥控器和电池了");
                }
            }
        }

    }

    public Deadlock(String name){
        super(name);
    }
}