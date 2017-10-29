package day06;

/**
 * Created by reyren on 2016/11/2.
 */

/*封装的步骤：
    1.使用private修饰需要被封装的属性
    2.提供一个公共的方法设置或者获取该私有的成员属性
* */


public class ClassMember {

    public static void main(String[] args){

        Member m = new Member();
        m.name = "狗娃";
        //m.sex = "不男不女";//性别错乱
        m.setSex("人妖");
        m.salary = 800;

        System.out.print("姓名" + m.name + " 性别" + m.getSex() + " 薪水" + m.salary);
    }
}

class Member{
    String name;
    private String sex;

    //公共的方法设置sex
    public void setSex(String s){
        if (s.equals("男")  || s.equals("女")){  //如果比较两个字符串的能容是否一致，不要使用==比较，使用equals比较
            sex = s;
        }else{
            //默认是男的
            sex = "男";
        }
    }

    //提供公共的方法获取属性
    public String getSex(){
        return sex;
    }

    int salary;

    //聊天
    public void tall(){
        System.out.print(name + "聊得非常开心");
    }
}
