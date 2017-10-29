package day08;

/**
 * Created by reyren on 2016/11/6.
 */

/*单例设计模式：保证一个类在内存中只有一个对象
    模式：模式就是解决一类问题的固定步骤
  饿汉单例设计模式的步骤：（一开始就new了，不管用到用不到）
    1.私有化构造函数
    2.申名本类的引用类型变量，并使用该变量指向本类对象
    3.提供一个公共静态的方法获取本类的对象
  懒汉单例式模式：
    1.私有化构造函数
    2.申名本类的引用类型变量,但是不要创建对象
    3.提供公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类的对象，如果已经创建了，那么直接返回对象即可，
      如果没有创建，那么先床架本类的对象，然后再返回。
  推荐使用饿汉单例式模式：
    因为懒汉单例式模式存在线程安全问题，目前还不能保证类在内存中只有一个对象
*
* */
public class demo2 {

    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);//内存地址一致

        Single2 s3 = Single2.getInstance();
        Single2 s4 = Single2.getInstance();
        System.out.println(s3 == s4);//内存地址一致


    }
}
//饿汉
class Single{

    private static Single s = new Single();//申名本类的引用类型变量，并使用该变量指向本类对象

    public static Single getInstance(){//提供一个公共静态的方法获取本类的对象，因为没有对象去访问
        return s;
    }

    private Single(){//私有化构造函数

    }
}
//懒汉
class Single2{

    //申名本类的引用类型变量,但是不要创建对象
    private static Single2 s;

    public static Single2 getInstance(){
        if (s == null){
            s = new Single2();
        }
        return s;
    }

    private Single2(){

    }
}