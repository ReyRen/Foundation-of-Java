package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by reyren on 2017/2/14.
 */
/*使用集合实现注册登录功能

第一步：提示用户选择功能， A（注册）B（登录） 要求：功能选择的时候忽略大小写
注册：
    1.提示用户输入注册的账号（数字）与密码，如果输入的id?号已经存在于集合中，提示用户重新输入。注册完毕后，把集合中的所有用户信息打印出来（使用toArray）
登录：
    提示用户输入登录的账号与密码，如果账号与密码这个用户已经存在于集合中，那么登录成功，否则登录失败

*
*
*
*
* */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection users = new ArrayList();//使用该集合保存所有的用户信息。
        while (true){
            System.out.println("请选择功能： A（注册）B(登录)");
            String option = scanner.next();
            if ("a".equalsIgnoreCase(option)){
                User user = null;
                while (true){
                    System.out.println("您输入账号");
                    int ID =  scanner.nextInt();
                    user = new User(ID, null);
                    if (users.contains(user)){//contains方法底层依赖了equals方法
                        //如果存在
                        System.out.println("请重新输入，该用户名已存在");
                    }else {
                        //不存在
                        break;
                    }
                }
                System.out.println("请输入密码：");
                String password = scanner.next();
                user.setPassword(password);
                //把user对象保存到集合中
                users.add(user);
                System.out.println("注册成功");
                System.out.println("当前注册的人员：" + users);



            }else if("b".equalsIgnoreCase(option)){
                System.out.println("您选择了登录功能");
                System.out.println("请输入账号：");
                int id = scanner.nextInt();
                System.out.println("请输入密码：");
                String password = scanner.next();
                //判断集合用户是否存在该用户名和密码
                //遍历集合的元素，查看是否存在该用户信息
                Iterator iterator = users.iterator();
                while (iterator.hasNext()){
                    User user = (User) iterator.next();
                }
            }else {
                System.out.println("您的选择有误，请重新输入");
            }
        }

    }
}
class User{
    int ID;
    String password;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User)obj;
        return this.ID == user.ID;

    }

    @Override
    public String toString() {
        return "{账号：" + this.ID + " 密码:" + this.password + "}";
    }
}