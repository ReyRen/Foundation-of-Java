package Advan_day3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reyren on 2017/4/26.
 */
public class myDefaultHandler3 extends DefaultHandler {
    //存储所有的联系人的对象
    private List<Contact> list = new ArrayList<Contact>();

    public List<Contact> getList() {
        return list;
    }



    private Contact contact;
    private String curTag;//临时读取当前读到的标签名字

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
     //读取到contact开始标签就创建Contact对象
        curTag = qName;
        if ("contact".equals(qName)){
            contact = new Contact();
            //设置id值
            contact.setId(attributes.getValue("id"));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //拿到当前的额文本内容
        String content = new String(ch,start,length);
        if ("name".equals(curTag)){
            contact.setName(content);
        }
        if ("age".equals(curTag)){
            contact.setAge(content);
        }
        if ("phone".equals(curTag)){
            contact.setPhone(content);
        }
        if ("email".equals(curTag)){
            contact.setEmail(content);
        }
        if ("qq".equals(curTag)){
            contact.setQq(content);
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        curTag = null;//是为了避免空格和换行设置到对象的属性中
        //读到contact结束表亲就放入list中
        if("contact".equals(qName)){
            list.add(contact);
        }
    }
}
