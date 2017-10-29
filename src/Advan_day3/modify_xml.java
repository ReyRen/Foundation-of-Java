package Advan_day3;

import jdk.nashorn.internal.runtime.ECMAException;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import javax.print.Doc;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by reyren on 2017/4/22.
 *//*
 * 增 标签 属性 文档（document）
 * 删 标签 属性
 * 改：属性值 文本
 * */
public class modify_xml {

    //增加
    @Test
    public void test1() throws Exception{
        //创建文档
        Document document = DocumentHelper.createDocument();

        Element rootElement = document.addElement("contactList");//创建跟标签
        Element contactElement = rootElement.addElement("contact");//跟标签的子标签
        contactElement.addElement("name");

        contactElement.addAttribute("id","001");
        contactElement.addAttribute("name","eric");




        //把修改的Document对象写出到xml文档中
        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(document);
        writer.close();
    }
    @Test
    public void test2() throws Exception{
        Document document = new SAXReader().read(new File("./src/Advan_day2/contact.xml"));


        /*//修改属性值1
        Element contactElement = document.getRootElement().element("contact");//得到标签对象
        Attribute idAttribute = contactElement.attribute("id");//得到属性对象
        idAttribute.setValue("003");//修改属性的值*/

        //修改属性值2
        Element contactElement = document.getRootElement().element("contact");//得到标签对象
        contactElement.addAttribute("id","004");//增加同名属性的方法来修改属性值

        //修改文本
        Element nameElement = document.getRootElement().element("contact").element("name");//得到标签对象
        nameElement.setText("李四");//修改文本




        //把修改的Document对象写出到xml文档中
        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(document);
        writer.close();
    }
    @Test
    public void test3() throws Exception{
        Document document = new SAXReader().read(new File("./src/Advan_day2/contact.xml"));



        //删除标签
        Element ageEmelent = document.getRootElement().element("contact").element("age");
        //ageEmelent.detach();//删除标签
        ageEmelent.getParent().remove(ageEmelent);//拿到父标签，然后干自己


        //删除属性
        Element contact2Emelent = (Element)document.getRootElement().elements().get(1);//得到第二个contact标签
        Attribute idAttr = contact2Emelent.attribute("id");
        idAttr.detach();



        //把修改的Document对象写出到xml文档中
        FileOutputStream out = new FileOutputStream("/Users/reyren/Desktop/HTMLTEST/XML1/contact.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(document);
        writer.close();

    }
}
