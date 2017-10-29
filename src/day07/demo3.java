package day07;

/**
 * Created by reyren on 2016/11/3.
 */
/*描述一个动物
*
* 存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量（java采取的是就近机制）
*
* this 关键字：
*   代表了所属函数的调用者对象，表示的也是地址
* this关键字的作用：
*   1.如果存在同名的成员变量与局部变量时，在方法内部默认访问的是局部变量，但通过this可指定访问成员变量
*   2.在一个构造函数中可以调用另外一个构造函数初始化对象
* this关键字要注意的事项：
*   1.存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量（java采取的是就近机制）
*   2.如果在一个方法中，访问了一个变量，该变量只存在成员变量的情况下，java编译器会在该变量的前面添加this关键字
* */

public class demo3 {

    public static void main(String[] args) {
        Animal a = new Animal("狗","白色");
        a.eat();
    }
}

class Animal{

    String name = "老鼠";
    String color;
    public void eat(){
        System.out.println(this.name + "在吃...");//这个this代表了调用者狗的对象
    }

    public Animal(String n, String c){
        name = n;
        color = c;
    }
}