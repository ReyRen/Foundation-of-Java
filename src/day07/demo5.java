package day07;

/**
 * Created by reyren on 2016/11/4.
 */
/*
* 使用java定义一个人类，人具备id,name,age三个属性，还具备一个比较年龄的方法
* */

public class demo5 {
    public static void main(String[] args) {
        Person p1 = new Person(110, "狗娃" , 1);
        Person p2 = new Person(119, "铁蛋", 19);
        p1.compareAge(p2);
    }
}

class Person{
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //比较年龄的方法
    public void compareAge(Person p2){
        if (this.age > p2.age){
            System.out.println(this.name + "大");
        }else if (this.age < p2.age){
            System.out.println(p2.name + "大");
        }else{
            System.out.println("同龄");
        }
    }
}
