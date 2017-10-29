package day19;

/**
 * Created by reyren on 2017/3/8.
 */
/*
* 枚举类：
*   一些方法在运行时，它需要的数据不是任意的，而必须要一定范围之内的值
* 定义格式：
*   enum 类名{
*       //枚举值
*   }
* 枚举注意的细节：
* 1.枚举类也是一个特殊的类
* 2.枚举值默认的修饰符是public static final
* 3.枚举值类型是所属的类的数据类型,枚举值是指向了本类的对象的
* 4.枚举类的构造方法默认的修饰符是private
* 5.枚举类可以定义自己的成员变量与成员函数
* 6.枚举类可以自定义构造函数，但是构造函数必须是private修饰
* 7.枚举类可以存在抽象的方法，但是枚举值必须要实现抽象的方法
* 8.枚举值必须要位于枚举类的第一个语句，否则报错
*
* */
public class demo5 {
    public static void main(String[] args) {
        Sex sex = Sex.man;
        //sex.value = "男";
        sex.getVaule();
        sex.run();
    }
}
//自定义一个枚举类
enum Sex{
    man("男"){
        @Override
        public void run() {
            System.out.println("男人在跑");
        }
    }, woman("女"){
        @Override
        public void run() {
            System.out.println("女人再跑");
        }
    };//枚举值
    /*、
    * 在编译的时候，自动切换成如下写法：
    *   public static final Sex man = new Sex();
    *   public static final Sex Woman = new Sex();
    *
    * */
    String value;//定义一个成员变量

    public void getVaule(){
        System.out.println(value);
    }

    private Sex(String value){
        this.value = value;
    }
    /*private Sex(){

    }*/
    public abstract void run();
}