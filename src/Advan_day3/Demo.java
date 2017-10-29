package Advan_day3;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;

/**
 * Created by reyren on 2017/4/26.
 */
/*
* 使用SAX解析把xml文档封装成对象
* */
public class Demo {
    public static void main(String[] args) throws Exception {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        myDefaultHandler3 handler3 = new myDefaultHandler3();
        parser.parse(new File("./src/Advan_day3/contact.xml"),handler3);
        List<Contact> list = handler3.getList();
        for (Contact contact:
             list) {
            System.out.println(contact);
        }
    }
}
