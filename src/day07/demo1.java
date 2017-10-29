package day07;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by reyren on 2016/11/3.
 */
/*构造函数：

  构造函数的作用：
    给对应的对象进行初始化.
  构造函数注意细节：
    1.没有返回值类型
    2.函数名必须要与类名一致
    3.构造函数并不是由我们手动调用的，而是在创建对象时，JVM就会主动的调用到对应的构造函数
    4.以前创建对象时，jvm会调用构造方法，java编译器在编译的时候给加上去的
        jdk提供了一个开发工具给我们进行反编译javap.exe，就将.class反编译出来了
    5.如果一个类没有显式的写上构造方法时，那么java编译器会为该类添加一个无参的构造函数的
    6.如果一个类已经显式的写上一个构造方法值，那么java编译器则不会再为该类添加一个无参的构造方法，所以自己写上之后，这个类中就没有无参的构造函数
      想要一个无参的构造函数必须自己再写一个
    7.java编译器添加的无参的构造方法的权限与类的权限一致
    8.构造函数可以在一个类中以函数重载的形式存在的

  构造函数与普通函数的区别：
    1.构造函数没有返回值类型，void一写就不再是构造函数了普通函数即使没有返回值类型也要写上void
    2.函数名不同
    3.调用方式不同
* */

/*构造代码块：
    给对象进行统一的初始化（就像底下的cry方法的重复书写）
*
*
*
* 构造代码块要注意的事项：
*   1.java编译器编译一个java源文件的时候，会把成员变量的申明语句提至一个类的最前端
*   2.成员变量中的赋值都是在构造函数中进行的,构造代码块的执行是在构造函数内代码块的前面执行的
*   3.成员变量的显初始化（Int a = 1000；）与构造代码块的代码是按照当前代码的顺序执行的
* */
public class demo1 {
    public static void main(String[] args) {
        Baby b = new Baby(110, "狗娃");//婴儿诞生，白户的话是一旦new就有名字了
        System.out.println("编号：" + b.id + " 姓名:" + b.name);
        //黑户
        Baby b2 = new Baby();
        b.id = 111;
        b.name = "狗剩";
        b.cry();
    }
}

class Baby{
    int id;//身份证
    String name;

    //构造代码块，一new就执行
    {
        cry();
    }

    //构造函数
    public Baby(int i, String n){
        id = i;
        name = n;
       // cry();
        System.out.println("baby的属性初始化完毕");
    }
    //无参的构造函数
    public Baby(){
        //cry();
        System.out.println("无参的构造函数被调用了");
    }

    public void cry(){
        System.out.println(name + "哇哇哇的哭....");//null是因为cry()放在构造代码块中执行，但是是在name = n之前执行的
    }
}
