package day14;

/**
 * Created by reyren on 2017/2/13.
 */
/*守护线程（后台线程）：
    如果一个进城中只剩下守护线程，那么守护线程也会死亡的
*
* 需求：模拟qq下载更新包
* */

public class demo7 extends Thread{
    public static void main(String[] args) {
        demo7 d = new demo7("后台线程");

        //是守护线程吗？
        //System.out.println("是守护线程吗" + d.isDaemon());//判断是不是守护线程，主线程结束了，d线程还在执行

        d.setDaemon(true);//设置线程是否为守护线程，true是守护线程，false是非守护，默认为非守护
       // System.out.println("是守护线程吗" + d.isDaemon());
       d.start();
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + i + "%");
        }

    }

    public demo7(String name){
        super(name);
    }

    @Override
    public void run() {
       for (int i = 1; i < 101; i++){
           System.out.println("更新包目前下载到了" + i + "%");
           if (i == 100){
               System.out.println("更新包下载完毕，准备安装");

           }
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
