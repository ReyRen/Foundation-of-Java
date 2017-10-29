package Advan_day3;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by reyren on 2017/4/22.
 */
public class login {
    public static void main(String[] args) throws Exception {
        //获取用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in是字节流，用转换流转换成字符流
        System.out.println("请输入用户名");
        String name = br.readLine();
        System.out.println("请输入密码");
        String password = br.readLine();

        //到xml中查找是否有对应的用户
        Document document = new SAXReader().read(new File("./src/Advan_day3/user.xml"));
        Element userElement = (Element) document.selectSingleNode("//user[@name='" + name + "' and @password='" + password + "']");
        if(userElement != null){
            //成功
            System.out.println("登录成功");
        }else{
            System.out.println("失败");
        }
    }
}
