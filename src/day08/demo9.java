package day08;

/**
 * Created by reyren on 2016/11/9.
 */
/*instancsof关键字
    判断一个对象是否属于指定的类别
  使用前提：
    判断的对象与指定的类别必须存在继承或者实现的关系
  作用：
    多态很有用
*
* */
public class demo9 {
    public static void main(String[] args) {
        Dog d = new Dog("哈士奇", "白色");
        System.out.println("狗是狗类吗？" + (d instanceof Dog));
        System.out.println("狗是动物类吗？" + (d instanceof Animal));
       // System.out.println("狗是老鼠物类吗？" + (d instanceof Mouse));d和Mouse没有继承关系所以报错
        Animal a = new Animal("狗娃","黄色");
        System.out.println("动物都是狗吗" + (a instanceof Dog));
    }
}
class Animal{
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }
    public void bite(){
        System.out.println(name + "咬人");
    }
}
class Mouse extends Animal{
    public Mouse(String name, String color) {
        super(name, color);
    }

    public void dig(){
        System.out.println(name + "打洞");
    }
}