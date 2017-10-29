package day17;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

/**
 * Created by reyren on 2017/3/4.
 *//*、
 * 迭代：
 *  keySet()//把map集合中的所有键都保存到一个Set集合类型中
 *  values()把所有的值存储到一个Collection集合中返回
 *  entrySet()
 *
 *
 *
 * */
public class demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("汪峰","章子怡");
        map.put("文章","马伊琍");
        map.put("谢霆锋","张柏芝");
        map.put("成龙","林凤娇");
        //map集合中遍历方式一：使用keySet方法进行遍历 缺点：ketSet方法只能是返回了所有的键，没有值
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println("键:" + key + "  值："+ map.get(key)) ;
        }

        //map集合的遍历方式二：使用values方法进行遍历。缺点：values方法只能返回所有的值，没有键
        Collection<String> c = map.values();
        Iterator<String> it2 = c.iterator();
        while (it2.hasNext()){
            System.out.println("值：" + it2.next());
        }

        //map集合中的遍历方式三，entrySet方法遍历
        Set<Map.Entry<String,String>> entrys = map.entrySet();
        Iterator<Map.Entry<String,String>> it3 = entrys.iterator();
        while (it3.hasNext()){
            Map.Entry<String,String> entry = it3.next();
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
