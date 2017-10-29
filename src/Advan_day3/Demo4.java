package Advan_day3;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 用xpath提取xml信息
 *
 */
public class Demo4 {

	public static void main(String[] args) throws Exception{
		Document doc = new SAXReader().read(new File("./src/Advan_day3/personList.html"));


		Element titleElem = (Element)doc.selectSingleNode("//title");
		String title = titleElem.getText();
		System.out.println(title);
		
		/**
		 * 读取联系人的所有信息
		 * 按照以下格式输出:
		 * 	1.编号:姓名:性别:年龄:地址:电话:
		 * 	2......
		 */
		//1.读取body中所有的tr标签

		List<Element> list = (List<Element>)doc.selectNodes("//tbody/tr");
		//2.遍历
		for (Element elem : list) {
			//编号
			//String id = ((Element)elem.elements().get(0)).getText();
			String id = elem.selectSingleNode("td[1]").getText();
			//姓名
			String name = ((Element)elem.elements().get(1)).getText();
			//性别
			String gender = ((Element)elem.elements().get(2)).getText();
			//年龄
			String age = ((Element)elem.elements().get(3)).getText();
			//地址
			String address = ((Element)elem.elements().get(4)).getText();
			//电话
			String phone = ((Element)elem.elements().get(5)).getText();
			
			System.out.println("编号"+id+"\t姓名"+name+"\t性别"+
								gender+"\t年龄"+
								age+"\t地址"+address+
								"\t电话"+phone);
		}
	}
}
