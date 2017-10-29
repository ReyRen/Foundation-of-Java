package Advan_day2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * Created by reyren on 2017/4/20.
 */
public class dom4j_read {
    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();//创建一个xml的解析器对象
            //读取xml文件返回了一个document文件
            Document document = reader.read(new File("./src/Advan_day2/contact.xml"));
            //System.out.println(document);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }
}