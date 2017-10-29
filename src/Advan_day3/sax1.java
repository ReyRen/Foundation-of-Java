package Advan_day3;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by reyren on 2017/4/26.
 */
/*
* SAX读取xml文件
*
* */
public class sax1 {
    public static void main(String[] args) throws Exception {
        //创建SAXParser对象
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();//SAXParse是protected的所以要用工厂来调用

        //调用parse方法
        /*
        * 参数一:xml文档
        * 参数二:defaultHandler子类
        * */
        parser.parse(new File("./src/Advan_day3/contact.xml"),new myDefaultHandler());

    }
}

