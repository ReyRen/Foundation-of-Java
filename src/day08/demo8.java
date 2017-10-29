package day08;

/**
 * Created by reyren on 2016/11/7.
 */
/*需求：使用java描述一下普通的学生，java基础班的学生,就业班的学生
        所有学生都会学习。但是学习内容不一样。
        普通学生：马克思列宁主义
        基础班的学生：学习的是javaSE
        就业班的学生学习的是：javaEE+Android
* */
public class demo8 {
    public static void main(String[] args) {
        BaseStudent s = new BaseStudent("狗蛋");
        s.study();
    }
}
//普通学生类
class Student2{
    String name;

    public Student2(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(name + "学习马克思列宁主义");
    }
}
//基础班(是属于学生中的一种)
class BaseStudent extends Student2{
    public BaseStudent(String name) {
        //super.study();
        super(name);//指定调用父类的构造函数
    }

    //重写
    public void study(){
        System.out.println(name + "学习javaSE");
    }

}
//就业办
class WorkStudent extends Student2{
    public WorkStudent(String name) {
        super(name);
    }

    public void study(){
        System.out.println(name + "学习javaEE+Android");
    }
}
