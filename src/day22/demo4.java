package day22;

import java.io.*;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Created by reyren on 2017/3/17.
 */
/*Properties（配置文件类）：主要用于生成配置文件和读取配置文件的
*
*注意事项：
*   1.如果Properties的信息一旦使用了中文，那么在使用store方法生成配置文件的时候只能使用字符流解决，如果使用字节流生成配置文件的话默认使用的是默认使用的是iso-8859-1码表存储，这时候会出现乱码的
*   2.如果Properties中的内容发生了变化一定要重新存储配置文件，否则配置文件信息不会发生变化
* */

public class demo4 {
    public static void main(String[] args) throws IOException {
        //creatProperties();
        readProperties();
    }
    //保存配置文件的信息
    public static void creatProperties() throws IOException {
        //创建Properties
        Properties properties = new Properties();//是个容器
        properties.setProperty("狗娃","123");//键和值只能是String
        properties.setProperty("狗剩","234");
        properties.setProperty("铁蛋","345");

        /*Set<Entry<Object,Object>> entries = properties.entrySet();
        for (Entry<Object,Object> entry:
             entries) {
            System.out.println("键：" + entry.getKey() + " 值：" + entry.getValue());
        }*/

        //使用Properties生成配置文件
        //properties.store(new FileOutputStream("/Users/reyren/Desktop/TEST/properties.properities"),"hahaha");//第一个参数是一个输出流对象，第二个参数是使用一个字符串描述这个配置文件信息
        //因为是属于map集合所以出来的是无序的
        properties.store(new FileWriter("/Users/reyren/Desktop/TEST/properties2.properities"),"hahaha");
    }
    //读取配置文件的信息
    public static void readProperties() throws IOException {
        Properties properties = new Properties();
        //加载配置文件信息到Properties中
        properties.load(new FileReader("/Users/reyren/Desktop/TEST/properties2.properities"));//将配置文件信息加载到了properties中

        //遍历
        Set<Entry<Object,Object>> entries = properties.entrySet();
        for (Entry<Object,Object> entry:
                entries) {
            System.out.println("键：" + entry.getKey() + " 值：" + entry.getValue());
        }
        //修改狗娃密码
        properties.setProperty("狗娃","007");
        //重新把修改后的Properties再生成一个配置文件
        properties.store(new FileWriter("/Users/reyren/Desktop/TEST/properties2.properities"),"hehe");
    }
}
