package Advan_day2;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by reyren on 2017/4/21.
 */
/*
*完整的读取xml文件的内容
* */

public class xml_read3 {
    @Test
    public void test() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("./src/Advan_day2/contact.xml"));

        //读根标签
        Element rootElement = document.getRootElement();

        StringBuffer sb = new StringBuffer();

        getChildNodes(rootElement,sb);
        System.out.println(sb.toString());

    }

    //获取当前标签的所有子标签
    private void getChildNodes(Element element,StringBuffer sb){
        //System.out.println(element.getName());
        //拼凑一个开始标签
        sb.append("<" + element.getName());

        //得到标签的属性列表
        List<Attribute> attrList = element.attributes();
        if (attrList != null) {
            for (Attribute attr :
                    attrList) {
                //System.out.println(attr.getName() + "=" + attr.getValue());
                sb.append(" " + attr.getName() + "=\"" + attr.getValue() + "\"");
            }
        }
        sb.append(">");
        //sb.append(element.getText());

        /*String text = element.getText();
        System.out.println(text);*/


        Iterator<Node> it = element.nodeIterator();
        //遍历
        while (it.hasNext()){
            Node node = it.next();
            //标签
            if (node instanceof Element){
                Element el = (Element)node;
                getChildNodes(el,sb);
            }
            //文本
            if (node instanceof Text){
                Text text = (Text)node;
                sb.append(text.getText());
            }
        }

        //结束标签
        sb.append("</" + element.getName() + ">");
    }

}
