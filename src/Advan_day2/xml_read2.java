package Advan_day2;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.w3c.dom.Attr;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by reyren on 2017/4/20.
 */
public class xml_read2 {

    //得到一些节点的信息
    @Test
    public void test1() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));

        Iterator<Node> iterator = document.nodeIterator();//得到节点下的所有的的子节点的对象
        while (iterator.hasNext()){//判断一下是否有下一个元素
            Node node = iterator.next();
            if (node.getName() != null) {
                String name = node.getName();//得到这个节点的名称
                System.out.println(name);

                //继续取出子节点,只有标签节点才能有子节点
                if (node instanceof Element){//判断当前节点是否是标签节点
                    //instanceof是判断node是否是属于Element类型
                    Element element = (Element)node;
                    Iterator<Node> iterator2 = element.nodeIterator();
                    while (iterator2.hasNext()){
                        Node node2 = iterator2.next();
                        String name2 = node2.getName();//得到这个节点的名称
                        System.out.println(name2);
                    }
                }
            }else{
                continue;
            }

        }
    }

    //遍历xml文档中的所有节点
    @Test
    public void test2() throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));

        Element rootElem = document.getRootElement();//得到根标签
        getChildNodes(rootElem);
    }

    //获取传入的标签下的所有子节点
    private void getChildNodes(Element element){
        System.out.println(element.getName());
        //得到子节点
        Iterator<Node> iterator = element.nodeIterator();
        while (iterator.hasNext()){
            Node node = iterator.next();

            //判断是否是标签节点
            if (node instanceof Element){
                Element element2 = (Element)node;
                //递归
                getChildNodes(element2);
            }
        }
    }
    /*
    * 获取标签
    * */
    @Test
    public void test3() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));

        //得到根标签
        Element rootElement = document.getRootElement();
        //得到这个标签的名称
        String name = rootElement.getName();
        System.out.println(name);

        /*//得到当前标签下的第一个指定名称的子标签
        Element contactElement = rootElement.element("contact");
        System.out.println(contactElement.getName());*/

        /*//得到标签下指定名称的所有子标签
        Iterator<Element> iterator = rootElement.elementIterator("contact");
        while (iterator.hasNext()){
            Element element = iterator.next();
            System.out.println(element.getName());
        }*/

        //得到跟标签下的所有子标签
        List<Element> list = rootElement.elements();
        //遍历list
        /*1.传统的for循环
        、
        *2.增强for
         * 3.迭代器
        * */
        /*for (int i = 0; i < list.size();i++){
            Element element = list.get(i);
            System.out.println(element.getName());
        }*/

        /*for (Element element:
             list) {
            System.out.println(element.getName());
        }*/

        /*Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            Element element =  iterator.next();
            System.out.println(element.getName());
        }*/

        //获取更深层次的标签（方法只能是一层一层的获取）
        Element nameElement = document.getRootElement().element("contact").element("name");
        System.out.println(nameElement.getName());
    }

    //获取属性
    @Test
    public void test4() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));

        //获取属性，先获得属性所在的标签对象，然后才能获得属性
        Element contactElement = document.getRootElement().element("contact");

        /*//得到属性对象
        String idVaule = contactElement.attributeValue("id");
        System.out.println(idVaule);*/

        /*//得到指定属性名称的属性对象
        Attribute idAttr = contactElement.attribute("id");
        System.out.println(idAttr.getName() + " " + idAttr.getValue());*/

        //得到所有属性的对象
        /*List<Attribute> list = contactElement.attributes();
        //遍历所有的这些属性
        for (Attribute attr:
             list) {
            System.out.println(attr.getValue() + " " + attr.getName());
        }*/

        //返回的是迭代器
        Iterator<Attribute> it = contactElement.attributeIterator();
        while (it.hasNext()){
            Attribute attr = it.next();
            System.out.println(attr.getValue() + " " + attr.getName());
        }
    }
    /*
    * 获取文本内容
    * */
    @Test
    public void test5() throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));

        /*我们的空格和换行也是xml为文本
        *所以说要有良好的xml编程习惯
        *
        * */


        /*//获取文本。先获得标签，再获得标签上的文本
        Element nameElement = document.getRootElement().element("contact").element("name");
        //得到文本
        String text = nameElement.getText();
        System.out.println(text);*/

        //获取得到指定子标签的文本名的内容
        String text = document.getRootElement().element("contact").elementText("name");
        System.out.println(text);
    }
}