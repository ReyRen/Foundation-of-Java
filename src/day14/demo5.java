package day14;

import com.sun.tools.doclets.internal.toolkit.util.ClassUseMapper;

/**
 * Created by reyren on 2017/2/11.
 */
/*线程的通讯：一个线程完成了自己的任务是，要通知另外一个线程去完成另外一个任务

生产者与消费者

wait();等待，如果线程执行了wait方法，那么该线程会进入等待状态下的线程，必须要被其他线程调用notify方法才能唤醒
    一个线程如果执行了wait方法，那么该线程就会进入一个以锁对象为标识的线程池中等待
notify();唤醒等待的线程
    如果一个线程执行了notify方法那么就会唤醒以锁对象为标识符的线程池中等待的线程其中一个
notifyAll();唤醒线程池中所有等待的线程

这俩方法的注意事项：
    1.wait方法与notify方法属于Object对象的
    2.wait方法与notify方法必须要在同步代码快或者同步函数中使用
    3.这俩方法必须由锁对象调用

* */
public class demo5 {
    public static void main(String[] args) {
        Product p = new Product();//没必要写成static因为product只new了一次

        Producer producer = new Producer(p);

        Customer customer = new Customer(p);

        producer.start();
        customer.start();
    }
}

//产品类
class Product {
    String name;

    double price;

    boolean flag = false;//产品是否生产完毕的标志，默认情况是没有生产完成的。

}
//生产者类
class Producer extends Thread{

    Product p;

    public Producer(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        int i = 0;
            while (true){
                synchronized (p){
                    if (p.flag == false) {


                        if (i % 2 == 0) {
                            p.name = "苹果";
                            p.price = 6.5;
                        } else {
                            p.name = "香蕉";
                            p.price = 2.0;
                        }
                        System.out.println("生产者生产出了：" + p.name + " 价格是:" + p.price);
                        p.flag = true;
                        i++;
                        p.notify();//唤醒消费者消费
                    }else {
                        //已经成产完毕了,等待消费者先去消费
                        try {
                            p.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                 }
            }
         }
    }

//消费者
class Customer extends Thread{

    Product p;

   public Customer(Product p){
       this.p = p;
   }

    @Override
    public void run() {
       while (true){
           synchronized (p){
               if (p.flag == true){
                   System.out.println("消费者消费了：" + p.name + " 价格是:" + p.price);
                   p.flag = false;
                   p.notify();//唤醒生产者去生产
               }else{
                   //产品还没有生产
                   try {
                       p.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

           }
       }
    }
}