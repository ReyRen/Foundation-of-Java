package Advan_day3;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by reyren on 2017/4/22.
 */
/*
* xpath表达式语法
*
* */
public class xpath2 {
    public static void main(String[] args) throws Exception {
        Document document = new SAXReader().read(new File("./src/Advan_day3/contact.xml"));

        String xpath = "";
        /*
        * / 从根标签开始
        * */

        xpath = "/contactList";
        xpath = "/contactList/contact";

        /*
        * //表示任何层次结构
        * */
        xpath = "//contact";//其实就是所有的contact标签直接拿出来，不管父是哪个
        xpath = "//contact/name";
        xpath = "//name";

        /*
        * 条件[]
        *
        * */
        //带有id属性的contact标签
        xpath = "//contact[@id]";
        //选取第二个contact标签
        xpath = "//contact[2]";
        //选取最后一个contact标签
        xpath = "//contact[last()]";
        //选取id属性001，name属性eric(在contact中俩属性)的节点
        xpath = "//contact[@id='001' and @name='eric']";
        //选取文本内容
        xpath = "//name/text()";
        //选择姓名是张三的contact标签
        xpath = "//contact/name[text()='张三']";//但是输出的时候要node.getparent();否则拿到的是name标签

        List<Node> list = document.selectNodes(xpath);
        for (Node node:
             list) {
            System.out.println(node);
        }

    }
}
