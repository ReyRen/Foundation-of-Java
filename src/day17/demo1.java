package day17;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by reyren on 2017/3/2.
 */
/*双列集合：
    在现实生活中有些数据是以映射关系存在的，也就是成对存在的

 -------------| Map 如果实现了Map接口的集合类具备的特点是：存储的数据都是以键值对的形式存在的，键不可以重复，值可以重复
 ----------------|HashMap
 ----------------|TreeMap
 ----------------|HashTable

 Map接口的方法：
    添加：
        put(K key, V value)
        putAll(Map<? extends k, extends V> m)

    获取:
        get(Object key)根据指定的键获取对应的值
        size()获取map集合中的键值对的个数
    判断：
        containsKey(Object key)判断map集合是否包含指定的键
        containsValue(Object value)判断map集合是否是空元素
        isEmpty()判断map集合是否是空元素
    删除
        clear()
        remove(Object key)
    迭代：
        keySet()
        entrySet()
        values()

* */

public class demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("汪峰","章子怡");
        map.put("文章","马伊琍");
       /* //添加
        map.put("汪峰","章子怡");
        map.put("文章","马伊琍");
        map.put("谢霆锋","张柏芝");
        System.out.println("返回值:" + map.put("谢霆锋" , "王菲"));//返回值返回的是：如果之前没有存在该键，那么返回的是null，如果之前就已经存在该键了，那么久返回该键之前对应的值
        System.out.println("集合的元素是：" + map);*/

      /* Map<String,String> map2 = new HashMap<String, String>();
        map2.put("杨振宁","翁帆");
        map2.put("习总","彭丽媛");

        map.putAll(map2);//把map2的元素添加到map集合中*/

      /*//删除的方法
        System.out.println("删除的数据是:" +map.remove("汪峰"));//根据键删除map中的数据，返回的是该键对应的值
        map.clear();//清空集合的所有数据
        map.put(null,null);是不空的
        System.out.println("集合的元素是：" + map);*/

      /*//获取
        System.out.println("根据指定的键获取对应的值:" + map.get("文章"));

        System.out.println("获取map集合中的键值对的个数:" + map.size());*/

        /*//判断
        System.out.println("判断map集合是否包含指定的键:" + map.containsKey("文章"));
        System.out.println("判断map集合是否包含指定的值:" + map.containsValue("章子怡"));
        System.out.println("判断map集合是否是空元素" + map.isEmpty());*/


    }
}
