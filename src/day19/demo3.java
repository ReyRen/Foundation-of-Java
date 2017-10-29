package day19;

import java.util.Iterator;

/**
 * Created by reyren on 2017/3/8.
 */
/*可变参数：

  需求：定义一个函数做加法功能(函数做几个数据的加法功能是不确定的)
  格式类型:
    数据类型... 变量名
  注意事项:
    1.如果一个函数的形参使用上了可变参数之后，那么调用该方法的时候可以传递参数，也可以不传递参数
    2.可变参数实际上是一个数组对象
    3.可变参数必须位于形参中的最后一个
    4.一个方法最多也只能有一个可变参数，因为可变参数要位于形参中最后一个位置
* */

public class demo3 {
    public static void main(String[] args) {
        add(1,3,4,6,7,8,6);
    }
    public static void add(int... arr){
        int result = 0;
        for (int item:
             arr) {
            result = item + result;
        }
        System.out.println(result);
    }
}
