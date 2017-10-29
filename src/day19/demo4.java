package day19;

/**
 * Created by reyren on 2017/3/8.
 */
/*自动装箱与自动拆箱
    一些类描述java中的八种基本数据类型
    基本数据类型      包装类型
    byte            Byte
    short           Short
    int             Integer
    long            Long
    float           Float
    double          Double
    boolean         Boolean
    char            Character

  基本数据类型数据有了对应的包装类型的好处：
        1.可以把字符串转换成对应的数字还能把数字转换成对应的字符串
        2.把整数转换成对应的进制形式
*
* */
public class demo4 {
    public static void main(String[] args) {
        String str = "12";
        //把字符串转换成int类型数据
        int i = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(Integer.toString(i));//把整数转换成对应的字符串

        //把整数转换成对应的进制形式
        System.out.println("10的二进制：" + Integer.toBinaryString(10));
        System.out.println("10的八进制：" + Integer.toOctalString(10));
        System.out.println("10的十六进制：" + Integer.toHexString(10));
        //可以把字符串当成对应的进行数据帮你转换
        String data = "10";
        int a  = Integer.parseInt(data,2);//把数据当做2进制进行十进制的转换
        System.out.println(a);

        //自动装箱：自动把java中的基本数据类型数据转换成对象类型数据
        int temp = 10;//基本数据类型
        Integer b = temp;//把a存储的值赋予b变量

        //自动拆箱：把引用类型的数据转换成基本类型的数据
        Integer c = new Integer(13);
        int d = c;
        System.out.println(d);

        //引用的数据类型
        Integer e = 120;
        Integer f = 120;
        System.out.println("同一个对象吗?" + (e == f));//==表示的是内存地址在引用类型中
        //Integer类内部维护了一个缓冲数组存储的-128~127在一个数组中，如果你获取的数据是落入到这个范围之内的就直接从该缓冲区中获取对应的数据
        Integer m = 128;
        Integer n = 120;
        System.out.println("同一个对象吗?" + (m == n));//缓存区没了，就得创建全新的对象了
    }
}
