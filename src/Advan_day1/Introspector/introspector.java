package Advan_day1.Introspector;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by reyren on 2017/4/7.
 */
/*
* 内省(一个变态的反射而已):
*
*主要是把一些对象的属性封装到对象中去
* */

public class introspector {
    public static void main(String[] args) {

    }
    @Test
    public  void testProperty() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        Person p = new Person();
        //属性描述器
        PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
        //获取属性对应的set
        Method m = descriptor.getWriteMethod();
        //执行该方法设置属性值
        m.invoke(p,110);

        Method readMethod = descriptor.getReadMethod();//获取属性的get方法

        System.out.println(readMethod.invoke(p,null));
    }
    @Test
    public void getAllProperty() throws IntrospectionException {
        //内省类
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);//这个beanInfo就有了所有的属性了

        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();//获取一个类中的所有属性描述器

        for (PropertyDescriptor p : descriptors){
            System.out.println(p.getReadMethod());//得到所有的get方法
        }


    }


}
