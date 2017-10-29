package day12;

/**
 * Created by reyren on 2016/12/22.
 */
/*String字符串类：

    new String("abc")创建了几个对象
        两个，一个对象位于字符串常量池中，一个对象是位于堆内存中
*
* */
public class demo2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        /*"=="用于比较引用类型数据的时候比较的是两个对象的内存地址，equals方法默认也是两个对象的内存地址
        但是String类重写了Object的equals方法，比较的是两个字符串的内容是否一致
        *
        * */
        test(null);
    }

        //调用equals时，一般都用常量当做是调用者，这样永远不会存在空指针异常了
    public static void test(String str){
        if ("中国".equals(str)){
            System.out.println("回答真确");
        }else{
            System.out.println("回答错误");
        }

    }
}
