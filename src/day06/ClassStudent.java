package day06;

/**
 * Created by reyren on 2016/11/1.
 */

/*匿名对象：没有引用类型变量指向的对象称为匿名对象
*匿名对象注意事项：
*   1.我们一般不会给匿名对象赋予属性值，因为永远无法获取到
*   2.两个匿名对象，永远都不可能是同一个对象
*匿名对象的好处：
*   简化书写,可以尽快的释放内存空间
*匿名对象的应用场景：
*   1.如果一个对象需要调用一个方法，而调用完这个方法之后，该对象就不再使用了，这时候可以使用匿名对象
*   2.可以作为实参调用一个函数
* */

/*需求：调用student的study 方法，调用完就没你事了
*
* */


public class ClassStudent {

    public static void main(String[] args){
       // Student s = new Student();//不是匿名对象
        //new Student();//匿名对象
        //new Student().name = "狗娃";
        //System.out.print();
        System.out.print( new Student() == new Student());// ==用于引用类型变量时，比较的是内存地址，判断两个对象是否为同一个对象。

        new Student().study();

    }
}

class Student{

    int num;//学号
    String name;

    public void study(){
        System.out.print("好好学习");
    }
}
