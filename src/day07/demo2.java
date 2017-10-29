package day07;

/**
 * Created by reyren on 2016/11/3.
 */
/*描述一个员工类，员工具备的属性：id，name，age
  具备的公共行为：工作
  要求：一旦创建一个员工对象的时候，那么该员工就有对应的属性值
*
* */

public class demo2 {

    public static void main(String[] args) {
        Employee e = new Employee(110, "狗娃", 1);
        e.work();
    }
}
class Employee{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void work(){
        System.out.println(name + "好好工作，努力挣钱");
    }
}
