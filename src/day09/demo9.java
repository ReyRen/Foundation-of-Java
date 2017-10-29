package day09;

/**
 * Created by reyren on 2016/11/11.
 */
/*多态：父类的引用类型变量指向了子类的对象或是接口的引用类型变量指向了接口实现类的对象
多态的前提：必须存在继承或者实现关系
*多态注意细节：
*   1.多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量（无论是静态还是非静态）
*   2.多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数
*   3.多态情况下，子父类存在同名的静态的成员函数时，访问的是父类的成员函数
*   4.多态情况下，不能访问子类特有的成员
*           编译看左边：java编译器在编译的时候，会检查引用类型变量所属的类是否具备指定的成员，如果不具备，马上报错
* 总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员，只有在同名的非静态函数时才是访问子类的
*
* */
public class demo9 {
    public static void main(String[] args) {
        //多态
        Animal2 a = new Mouse("老鼠");
        System.out.println(a.color);
        a.eat();
        //a.dig();//编译看左边
    }
}
abstract class Animal2{
    String name;
    String color = "动物色";

    public Animal2(String name) {
        this.name = name;
    }
    public abstract void run();

    public void eat(){
        System.out.println("动物在吃饭");
    }
}

//老鼠
class Mouse extends Animal2{
    String color = "黑色";

    public Mouse(String name) {
        super(name);
    }

    public  void run(){
        System.out.println(name + "是四条腿慢慢的走");
    }

    public void eat(){
        System.out.println("老鼠在偷吃");
    }

    //老鼠特有方法
    public void dig(){
        System.out.println("老鼠在打洞");
    }
}

class Fish2 extends Animal2{
    public Fish2(String name) {
        super(name);
    }

    public  void run(){
        System.out.println(name + "摇摇尾巴游");
    }
}