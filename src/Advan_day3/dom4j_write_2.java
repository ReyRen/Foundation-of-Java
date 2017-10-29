package Advan_day3;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by reyren on 2017/4/22.
 */
/*
* 讨论写出内容到xml文档的细节
* */
public class dom4j_write_2 {
    public static void main(String[] args) throws Exception {
        Document document = new SAXReader().read(new File("./src/Advan_day2/contact.xml"));//放到内存中了

        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        /*
        * 指定一个写出的格式
        * */
        OutputFormat format = OutputFormat.createCompactFormat();//紧凑的格式
        OutputFormat format2 = OutputFormat.createPrettyPrint();//漂亮的格式
        /*
        * 指定生的XML的编码
        * 同时影响了xml文件保存时的编码，和xml文档申明的encoding编码
        * 结论：使用该方法生成的xml文档能避免中文的乱码问题
        * */
        format.setEncoding("UTF-8");



        //创建一个写出对象
        XMLWriter writer = new XMLWriter(out,format);//推荐CompactFormat

        //写出对象
        writer.write(document);

        //关闭
        writer.close();
    }
}
