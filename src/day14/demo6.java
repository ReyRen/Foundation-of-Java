package day14;

/**
 * Created by reyren on 2017/2/13.
 */
/*线程的停止：
    1.停止一个线程，我们一般都会通过一个变量控制的
    2.如果需要停止一个处于等待状态下的线程，那么我们需要通过变量配合notify或者我们的interrupt来使用

*
* */
public class demo6 extends Thread{

    boolean flag = true;

    public static void main(String[] args) {
        demo6 d = new demo6("狗娃");
        d.start();

        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //当主线程是80的时候，停止狗娃线程
            if (i == 80){
                d.flag = false;
            }
        }
    }

    public demo6(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println(Thread.currentThread().getName() + "：" + i);

        }
    }
}
