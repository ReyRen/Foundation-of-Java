package Advan_day3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by reyren on 2017/4/26.
 */
public class myDefaultHandler2 extends DefaultHandler{
    //存储xml文档的信息
    private StringBuffer sb = new StringBuffer();

    public String getContent(){
        return sb.toString();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        sb.append("<" + qName );
        //判断是否有属性
        if (attributes != null){
            for (int i = 0; i < attributes.getLength(); i++){
                //得到属性名
                String attrName = attributes.getQName(i);
                //得到属性值
                String attrValue = attributes.getValue(i);
                sb.append(" " + attrName + "=\"" + attrValue + "\"");

            }
        }
        sb.append(">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //得到当前读取的文本内容
        String content = new String (ch,start,length);
        sb.append(content);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        sb.append("</" + qName + ">");
    }
}
