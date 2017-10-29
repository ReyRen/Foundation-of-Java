package day13;


/**
 * Created by reyren on 2017/2/2.
 */
/*线程常用的方法:
    Thread(String name) 初始化线程名字
    getName()返回线程的名字
    setName(String name)设置线程对象名
    sleep() 线程睡眠指定的毫秒数,那个线程执行了sleep方法那么就是哪个线程睡眠
    getPriority()放回当前线程对象的优先级，默认线程的优先级是5
    setPriority(int newPriority)设置线程的优先级，虽然设置了优先级，但是具体实现取决于底层操作系统的实现（最大是10，最小是1）
    currentThread()返回CPU正在执行的线程的对象，该方法是个静态的方法，哪个线程执行了currentThread当前线程代码就返回哪个对象


*
* */
public class demo7 extends Thread{
    public static void main(String[] args) {
        demo7 d = new demo7("狗剩");
        System.out.println("线程的名字：" + d.getName());
        //d.sleep(1000);这里的代码都是主线程执行的，所以都是主线程在睡眠
        /*demo7 d2 = new demo7("狗娃");
        System.out.println("线程的名字：" + d2.getName());*/
        d.setName("铁蛋");//设置线程的名字
        d.start();//开启线程
        Thread mainThread = Thread.currentThread();//静态方法可以用类名进行调用的,当前在主线程中所以是返回主线程的对象
        System.out.println("主线程的名字："+ mainThread.getName());

    }

    @Override
    public void run() {
        System.out.println("this:" + this);
        System.out.println("当前对象：" + Thread.currentThread());//这两个是一样的因为d.start之后d就调用run方法，d是主线程中的代码。所以显示的当前调用的线程都是main
        /*for (int i = 0; i < 100; i++){
            System.out.println(this.getName()+ ":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {//虽然这是编译异常，能抛，但是父类thread的run方法都没有抛出异常，父类是三好市民，所以子类不能抛出异常类型
                e.printStackTrace();
            }
        }*/
    }
    public demo7(String name){
        super(name);//调用了Thread类的一个参数的构造方法
    }
}
