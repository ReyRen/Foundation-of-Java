package Advan_day1.Introspector;

import javafx.beans.binding.ObjectExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.Buffer;

/**
 * Created by reyren on 2017/4/7.
 */
/*、
* 需求：编写一个工厂方法根据配置文件的内容，工厂方法返回对应的对象，并把对象的属性封装起来,并且对象要有对应的属性值
* */
public class MAIN {
    public static void main(String[] args) throws Exception {
        Person p = (Person)getInstance();
        System.out.println(p);
    }
    //根据配置文件的内容生成对应的对象并且要把对象的属性值封装到对象中
    public static Object getInstance() throws Exception{
        //读取文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/reyren/IdeaProjects/Practice/src/Advan_day1/Introspector/obj.txt"));
        String className = bufferedReader.readLine();//读取配置文件获取到完整的类名
        Class clazz = Class.forName(className);
        //通过class对象获取到无参的构造方法(参数是null)
        Constructor constructor = clazz.getConstructor(null);
        //创建对象
        Object o = constructor.newInstance(null);
        //读取属性值
        String line = null;
        while ((line = bufferedReader.readLine())!= null){
            String[] datas = line.split("=");
            //通过属性名获取对应的Field对象
            Field field = clazz.getDeclaredField(datas[0]);
            if (field.getType() == int.class){

                field.set(o,Integer.parseInt(datas[1]));
            }else{
                field.set(o,datas[1]);
            }
        }
        return o;
    }
}
