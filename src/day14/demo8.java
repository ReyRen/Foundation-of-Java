package day14;

/**
 * Created by reyren on 2017/2/13.
 */
/*join方法，加入

*
* */

public class demo8 {
    public static void main(String[] args) {
        Mom m = new Mom();
        m.start();
    }
}
//老妈
class Mom extends Thread{

    @Override
    public void run() {
        System.out.println("妈妈洗菜");
        System.out.println("妈妈切菜");
        System.out.println("妈妈准备炒菜，发现没有酱油了");
        //叫儿子打酱油
        Son s = new Son();
        s.start();
        try {
            s.join();//一个线程如果执行了join语句，那么就有新的线程加入，执行该语句的线程必须让步给新加入的线程先完成任务，然后才能执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("妈妈继续炒菜");
        System.out.println("全家一起吃饭");
    }
}
//儿子
class Son extends Thread{
    @Override
    public void run() {
        System.out.println("儿子下楼");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("儿子一直往前走");
        System.out.println("儿子打到酱油");
        System.out.println("儿子上楼,把酱油给老妈");
    }
}