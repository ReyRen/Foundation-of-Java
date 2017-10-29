package day16;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by reyren on 2017/2/28.
 */
/*
*
* */

public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet set = new HashSet();
        while (true){
            System.out.println("请输入用户名：");
            String userName = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();

            //创建对象
            User user = new User(userName,password);
            if (set.add(user)){
                System.out.println("注册成功");
                System.out.println("当前的用户有：" + set);
            }else {
                System.out.println("注册失败");
            }
        }

    }
}

class User{
    String userName;
    String password;

    public User(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "用户名" + this.userName  +
                ", 密码='" + this.password +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        User user = (User) o;

       return this.userName.equals(user.userName) && this.password.equals(user.password);

    }

    @Override
    public int hashCode() {
        return userName.hashCode() + password.hashCode();

    }
}
