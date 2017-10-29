package Advan_day1.PATH;

import java.beans.PropertyDescriptor;
import java.io.*;
import java.util.Properties;

/**
 * Created by reyren on 2017/4/9.
 */
/*
*经常变化的文件应该定义在配置文件上，比如说，数据库的用户名和密码
 *
  * 绝对路径：一个文件的完整文件信息，一般绝对路径是有盘符的
  *
  * 相对路径：是相对于当前程序的路径,当前路径就是执行java命令的时候，控制台所在的路径
  *
  * 类文件路径：使用了classpath路径找对应的资源文件
  *
  * 如果需要使用到类文件路径首先先要获取到一个class对象
*
* */

public class DBUtil {
    static Properties properties;
    static {
        try {
            //加载配置文件
            properties = new Properties();

            Class clazz = DBUtil.class;
            InputStream inputStream = clazz.getResourceAsStream("/Advan_day1/PATH/db.properties");//  /代表了classPath的路径           这个方法里面使用的路径就是使用的类文件路径

            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //当前路径
        System.out.println(new File(".").getAbsolutePath());

        System.out.println("用户名:" + properties.getProperty("userName") + " 密码:" + properties.getProperty("password"));
    }
}
