package Advan_day2;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by reyren on 2017/4/21.
 */
/*把xml的信息封装到对象中
*
* */
public class TEST {
    public static void main(String[] args) throws Exception{
        List<Contact> list = new ArrayList<Contact>();
        //读取xml封装对象
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("./src/Advan_day2/contact.xml"));
        //读取contact标签
        Iterator<Element> it = document.getRootElement().elementIterator("contact");
        while (it.hasNext()){
            Element elem = it.next();
            //创建Contact
            Contact contact = new Contact();
            contact.setId(elem.attributeValue("id"));
            contact.setName(elem.elementText("name"));
            contact.setAge(elem.elementText("age"));
            contact.setPhone(elem.elementText("phone"));
            contact.setEmail(elem.elementText("email"));
            contact.setQq(elem.elementText("qq"));
            list.add(contact);
        }

        for (Contact contact:
             list) {
            System.out.println(contact.toString());
        }

    }
}
