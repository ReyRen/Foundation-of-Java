package day03;

/**
 * Created by reyren on 2016/9/26.
 */

/*
*
* 1.交换两个变量的值,不准出现第三方变量
* 2.取出一个二进制数据的指定位数，低四位
*       可以全部都&上0，要取得位数&上1
*
*
* */
public class XOR {

    public static void main(String[] args){

        /*定义第三方变量
        int a = 3;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;*/

        /*相加法 缺点：两个int类型的数据相加有可能会超出int的表示范围
        int a  = 3;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;*/

        /*异或
        int a  = 3;
        int b = 5;
        a = a^b;
        b = a^b;
        a = a^b;*/

    }
}
