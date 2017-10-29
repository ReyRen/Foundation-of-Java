package Advan_day3;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by reyren on 2017/4/22.
 */
/*
* xPath是用于快速得到所需节点对象
*   selectNodes 查找多个节点对象
*   selectSingleNode 查找一个节点对象
* */
public class xpath {
    public static void main(String[] args) throws Exception {
        //删除id为2的标签

        Document document = new SAXReader().read(new File("./src/Advan_day2/contact.xml"));

        //查找到id为002
        Element contactElement = (Element) document.selectSingleNode("//contact[@id='002']");//  //代表所有父元素是contact
                                                                                        //[]表示什么条件下的 返回的是Element
                                                                                        //@是属性，返回的是Attribute，不是标签
                                                                                        //contact[@id='002']担忧id='002'属性的contact标签
        contactElement.detach();

        //把修改的Document对象写出到xml文档中
        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(document);
        writer.close();
    }
}
