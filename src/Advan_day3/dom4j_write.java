package Advan_day3;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by reyren on 2017/4/22.
 */
/*
*
*写出内容到xml文档
* */

public class dom4j_write {
    public static void main(String[] args) throws Exception {
        //读取day07项目的xml文件
        Document document = new SAXReader().read(new File("./src/Advan_day2/contact.xml"));//放到内存中了

        //修改doc对象内容



        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        //创建一个写出对象
        XMLWriter writer = new XMLWriter(out);

        //写出对象
        writer.write(document);

        //关闭
        writer.close();

    }


}
