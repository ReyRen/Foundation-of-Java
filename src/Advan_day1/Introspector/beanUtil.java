package Advan_day1.Introspector;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by reyren on 2017/4/9.
 */
/*
* BeanUtils:
*   把对象的属性封装到对象中去
*
* BeanUtils使用的步骤：
*   1.导入commons-logging.jar和commons-beanutils.jar
*
* BeanUtils的好处：
*   1.BeanUtils设置属性值得时候，如果属性是基本数据类型，beanUtils会走动帮我们转换数据类型设置成功
*   2.BeanUtils设置属性值的时候，底层也是依赖于get set方法获取以及设计属性值的
*   3.BeanUtils设置的属性值，如果设置的属性是其他的引用类型数据，那么必须要注册一个类型转换器
* */

public class beanUtil {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //从文件中读取到的数据都是字符串的数据，或者是表单提交的数据，获取到的时候也是字符串的数据
        String id = "110";
        String name = "陈器";
        String salary = "1000";
        String birthday = "2013-12-10";
        //将上面的数据封装到对象中去

        //注册类型转换器
        ConvertUtils.register(new Converter() {//converter是个接口
            @Override
            public Object convert(Class type, Object value) {//type：Data type to which this value should be converted 其实还是个Date类型，就是目前所遇到的数据类型
                Date date = null;
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   //value目前参数的值
                    date = dateFormat.parse((String)value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return date;

            }
        }, Date.class);


        Emp emp = new Emp();
        BeanUtils.setProperty(emp,"id",id);
        BeanUtils.setProperty(emp,"name",name);
        BeanUtils.setProperty(emp,"salary",salary);
        BeanUtils.setProperty(emp,"birthday",birthday);

        System.out.println(emp);

    }
}
