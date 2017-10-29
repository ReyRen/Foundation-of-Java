package day16;

/**
 * Created by reyren on 2017/2/28.
 */
/*
*
* */


public class demo5 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("两个是同一个对象吗？" + (str1 == str2));//==是比较内存空间是否相同，一个是字符串常量池一个是堆中

        System.out.println("str1的hashcode：" + str1.hashCode());
        System.out.println("str2的hashcode：" + str2.hashCode());//虽然是不同对象，但是hash码值是一样的，hashcode默认情况下表示的是内存地址，原因是String类已经重写了Object的hashcode方法了
                                                                    //是将里面的字符串一个一个取出来的比较的
        //如果两个字符串的内容一致，返回的hashcode肯定一致，因为重写了
    }
}
