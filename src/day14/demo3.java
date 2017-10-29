package day14;

/**
 * Created by reyren on 2017/2/3.
 */
/*自定义线程的创建方式二：
    1.自定义一个类实现Runable接口
    2.把线程的任务定义在run方法上。
    3.创建Runable实现类的对象，
    4.创建Thread类的对象，并且把Runable实现类的对象作为实参传递
    5.调用Thread对象的start方法，开启一个线程

注意：
    Runable实现类的对象并不是线程对象，只不过是实现了Runable接口的对象而已。
    只有Thread和Thread的子类才是线程对象

    为什么要把Runable实现类的对象作为实参传递给Thread对象呢？作用是什么？
    作用就是把Runable实现类的对象的Run方法作为了线程的任务代码去执行了。

    推荐使用Runable实现线程
        原因
            1.因为java是单继承，多实现的
*
* */
public class demo3 implements Runnable{
    @Override
    public void run() {
        /*for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }*/
        System.out.println("this:" + this);//这个就是d线程的对象，因为是d调用的run
        System.out.println("当前线程：" + Thread.currentThread().getName());//这里是狗娃
    }

    public static void main(String[] args) {
        demo3 d = new demo3();

        //创建Thread类的对象，把Runable实现类对象作为实参传递
        Thread thread = new Thread(d,"狗娃");//多态,线程名字叫狗娃


        //调用对象的thread方法开启线程
        thread.start();

        /*for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }*/



    }
}
