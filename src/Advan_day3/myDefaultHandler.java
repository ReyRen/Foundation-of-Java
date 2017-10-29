package Advan_day3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by reyren on 2017/4/26.
 */
public class myDefaultHandler extends DefaultHandler {
    //处理程序

    /*开始文档时调用
    *
    * */
    @Override
    public void startDocument() throws SAXException {
        System.out.println("myDefaultHandler.startDocument");//soutm
    }
    /*
    * 开始标签时
    * qname:表示开始标签的标签名
    * @param attributes:表示开始标签内包含的属性列表
    * */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("myDefaultHandler.startElement--->" + qName);
    }

    /*
    * 结束标签
    * qname:结束标签的名字
    * */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("myDefaultHandler.endElement-->" + qName);
    }
    /*
    * 读到文本内容时调用
    * ch 表示xml所有的文本内容
    * start表示当前文本内容的开始位置
    * length表示当前文本内容的长度
    * */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        //得到当前的文本内容
        String contect = new String(ch,start,length);
        System.out.println("myDefaultHandler.characters--->" + contect);
    }

    /*结束文档时调用
                *
                * */
    @Override
    public void endDocument() throws SAXException {
        System.out.println("myDefaultHandler.endDocument");
    }
}
