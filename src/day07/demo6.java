package day07;

/**
 * Created by reyren on 2016/11/4.
 */

/*目前问题：所有学生都是中国的，有n个学生就会有n份中国的数据存内存中，很浪费内存
  解决方案：把"中国"这个数据移动到数据共享区中，共享这个数据给所有的student对象使用。
  用static修饰该数据即可

  静态成员变量（static）只会在数据共享区中维护一份，而非静态成员变量的数据会在每个对象中都维护一份的
*
* */
public class demo6 {
    public static void main(String[] args) {
        Student02 s1 = new Student02("狗娃");
        Student02 s2 = new Student02("狗蛋");
        System.out.println("姓名：" + s1.name + " 国籍" + s1.country);
        System.out.println("姓名：" + s2.name + " 国籍" + s2.country);
    }
}

class Student02{
    String name;
    static String country = "中国";//国籍，没有static在堆内存中的每个对象中都有中国属性，和构造代码块一样，而又static只是在数据共享区有一个
                                    //一旦被一个对象所改变了值，那么另外一个对象的值也就改变了，因为对象都是从这个区域拿值
    public Student02(String name) {
        this.name = name;

    }
}
