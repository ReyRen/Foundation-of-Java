package day17;

import java.util.AbstractCollection;
import java.util.Arrays;

/**
 * Created by reyren on 2017/3/4.
 */
/*正则表达式主要用于操作字符串，正则表达式对字符串的操作主要有一下集中应用：
    匹配（matches）
    切割
    替换 replaceAll(String regex, String replacement);
    查找
*
*
* */
public class demo10 {
    public static void main(String[] args) {
        String phone = "13684874748";
        matchesPhone(phone);
        String tel = "0351-7862688";
        matchesTel(tel);
        testSpilit();
        testSplit2();
        replaceTest1();
        replaceTest2();
    }
    //需求：编写一个正则表达式匹配手机号
    public static void matchesPhone(String phone){
        String reg = "1[34578]\\d{9}";
        System.out.println(phone.matches(reg)?"合法手机号":"非法手机");
    }

    //需求2：匹配固定电话 区号+主机号
    public static void matchesTel(String tel){
        System.out.println(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}")?"合法电话":"非法电话");
    }

    //按照空格切割
    public static void testSpilit(){
        String str = "明  天  放      加";
        String[] datas = str.split(" +");
        System.out.println("数组的元素：" + Arrays.toString(datas));
    }

    //需求：根据重叠池进行切割
    public static void testSplit2(){
        String str = "大家家家家家家家明天天天天天玩的的的的的开心";//大 明 玩 开心
        String[] str2 = str.split("(.)\\1+");//如果正则的内容需要被复用，那么需要对正则进行分组，分组的目的就是为了提高正则的复用性,组号是从1开始
        System.out.println("数组的元素是:" + Arrays.toString(str2));
        /*
        *()分组：分组的目的是为了让正则的内容复用起来。组号是从1开始
        *   ((A)(B(C)))--按括号数就行了
        *   组号1:((A)(B(C)))
        *   组号2:(A)
        *   组号3:(B(C))
        *   组号4:(C)
        *\1表示引用第一组所匹配到的内容
        *
        * */
    }

    //替换
    public static void replaceTest1(){
        String str = "如有需求请联系我：13520398746 如有需求请联系我：13520398746 如有需求请联系我：13520398746";
        String reg = "1[34578]\\d{9}";
        str = str.replaceAll(reg,"****");
        System.out.println("被替换的内容是：" + str);
    }
    public static void replaceTest2(){
        String str = "我我我要要要做项项项项项项目目";//还原话----我要做项目。把重叠词替换成单个单词
        str = str.replaceAll("(.)\\1+","$1");//如果需要在replaceAll方法正则的外部引用组的内容，那么使用"$组号"
        System.out.println(str);
    }
}
