package day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by reyren on 2017/3/18.
 */
/*需求：使用properties实现本软件只能运行三次，超过三次之后就提示购买正版，退jvm

* */

public class demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/count.properties");
        if (!file.exists()){
            //如果配置文件不存在则创建该配置文件
            file.createNewFile();

        }
        //创建Properties对象
        Properties properties = new Properties();
        //把配置文件的信息加载到properties中
        properties.load(new FileInputStream(file));

        int count = 0;//用于保存软件的运行次数的
        //读取配置文件的运行次数
        String value = properties.getProperty("count");
        if (value != null){
            count = Integer.parseInt(value);
        }
        //判断使用的次数是否已经达到了3次
        if (count == 3){
            System.out.println("你已超出了使用次数，请购买正版软件");
            System.exit(0);
        }
        count++;
        System.out.println("你应经使用了本软件第" + count + "次");
        properties.setProperty("count",count+"");
        //使用properties生成一个配置文件
        properties.store(new FileOutputStream(file),"runtime");
    }
}
