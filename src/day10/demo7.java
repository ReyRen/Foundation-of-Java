package day10;

/**
 * Created by reyren on 2016/12/7.
 */
/*异常,所有的异常类都是以Throwable做父类的

throwable常用方法：
    toString()返回当前这个异常对象的完整类名（包名+类名）+病态信息
    getMessage()返回的是创建Throwable传入的字符串信息
    printStackTrace()打印异常的栈信息
*
* */

public class demo7 {
    public static void main(String[] args) {
        /*Throwable throwable = new Throwable("头晕");//创建了一个throwable的对象，用到是无参的构造方法
        String info = throwable.toString();
        String info2 = throwable.getMessage();
        System.out.println(info);//java.lang.Throwable 包名+类名
        System.out.println(info2);*/
        test();
    }

    public static void test(){
        Throwable t = new Throwable();
        t.printStackTrace();
    }
}
