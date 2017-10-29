package day08;

/**
 * Created by reyren on 2016/11/7.
 */

/*目前存在的问题：
    1.无法描述清楚这两个类间的继承关系
    2.存在重复代码

  继承：
    继承的格式：class 类名1 extends 类名2{}
  继承注意事项：
    1.千万不要为了减少重复代码去继承，只有真正存在着继承关系才继承
    2.父类私有的东西是不能被继承的
    3.父类的构造函数不能被继承
    4.创建子类对象时，默认会先调用父类无参的构造函数
*
* */
public class demo4 {
    public static void main(String[] args) {
        Student s = new Student();
        /*s.name = "狗娃";
        System.out.println("名字：" + s.name);
        s.eat();*/
    }

}
//人
class Person{
    String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("person类的构造方法被调用了");
    }

    public void eat(){
        System.out.println(name + "在吃饭");
    }
}
//学生
class Student extends Person{  //student就称为Person 类的子类
    int num;
    //String name;


    public void study(){
        System.out.println(name + "好好学习");
    }

    public Student(){
        System.out.println("student类的构造方法被调用了");
    }



    /*public void eat(){
        System.out.println(name + "在吃饭");
    }*/
}