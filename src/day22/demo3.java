package day22;

import javax.jws.soap.SOAPBinding;
import java.io.*;

/**
 * Created by reyren on 2017/3/16.
 */
/*、
* 对象的输入输出流：主要是对象的输入输出流主要的作用是用于写对象的信息与读取对象的信息，对象信息一旦写到文件上，那么对象的信息就可以做到持久化了
*
* 对象的输出流：ObjectOutputStream(接收outputstream)使用步骤:
* 对象的输入流：ObkectinputStream(接收InoutStream)
*     对象输入输出流要注意的细节：
*     1.如果对象需要被写出到文件上，那么对象所属的类必须实现Serializable接口，没有任何的方法，只是个标志接口而已
*     2.对象的反序列化创建对象的时候并不会调用到构造方法的
*     3.serialVersionUID是用于记录class文件版本的信息的，serialVersionUID这个数字是通过一个类的类名，成员，包名，工程名这些东西算出来的数字
*     4.如果反序列化的时候使用objectInputStream，objectInputStream会先读取文件中的serialVersionUID然后与本地的serialVersionUID对比，如果不一致，就反序列化失败
*     5.如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类指定一个versionUID,如果一个类已经指定了VersionUID那么在序列化与反序列化的时候，jvm都不会再自己算class的versionUID了
*     6.如果一个对象某个数据不想被序列化到硬盘上，可以使用关键字transient修饰
*     7.如果一个类维护了另外一个类的引用，那么另外一个类也需要实现Serializable接口
*
*
* */
public class demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*User user = new User("admin","123");
        System.out.println(user);*/
        //把user对象的信息持久化的存储
        writeObj();
        readObj();
    }
    //对象的反序列化:把文件中的对象信息读取出来
    public static void readObj() throws IOException, ClassNotFoundException {
        File file = new File("/Users/reyren/Desktop/TEST/obj.txt");
        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立对象的输入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user = (User) objectInputStream.readObject();//创建对象肯定依赖对象所属的class文件
        System.out.println("对象的信息:" + user);
    }



    //先定义一个方法，把对象的信息写到硬盘上----对象序列化到硬盘
    public static void writeObj() throws IOException {

        //把user对象的信息持久化的存储
        Address address = new Address("中国", "孝义");
        User user = new User("admin","123",12,address);
        //找到目标文件
        File file = new File("/Users/reyren/Desktop/TEST/obj.txt");
        //建立数据的输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //建立对象的输出流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //把对象写出
        objectOutputStream.writeObject(user);

        objectOutputStream.close();
    }

}


class User implements Serializable{

    private static final long serialVersionUID = 1L;

    String userName;
    String password;
    transient int age;//透明，当写出这个字段的时候，不会再将age的信息写出
    Address address;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, int age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public User(String userName, String password, int age, Address address) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "用户名: " + this.userName + " 密码: " + this.password + " 年龄: " + age + " 地址: " + address.city;
    }
}
class Address implements Serializable{
    String country;
    String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
}