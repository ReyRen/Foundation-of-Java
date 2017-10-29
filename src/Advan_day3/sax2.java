package Advan_day3;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by reyren on 2017/4/26.
 */
/*读取contact.xml文件，完整的输出文档内容
*
* */
public class sax2 {
    public static void main(String[] args) throws Exception {
        //创建SAXParser独享
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        //读取xml文件
        myDefaultHandler2 handler2 = new myDefaultHandler2();
        parser.parse(new File("./src/Advan_day3/contact.xml"),handler2);
        String content =handler2.getContent();
        System.out.println(content);
    }
}
