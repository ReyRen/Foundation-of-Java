package day13;

import java.util.Random;

/**
 * Created by reyren on 2017/2/1.
 */
/*
* math类：提供了很多的数学公式给我们
*   abs(double a)获取绝对值
*   ceil(double a)向上取整
*   floor(double a)向下取整
*   round(float a)四舍五入
*   random()产生一个随机数
* */

public class demo4 {
    public static void main(String[] args) {

        System.out.println("绝对值：" + Math.abs(-5));
        System.out.println("向上取整：" + Math.ceil(3.14));
        System.out.println("四舍五入：" + Math.round(3.54));
        System.out.println("随机数：" + Math.random());
        Random random = new Random();
        int a = random.nextInt(10);//产生的随机数是0到10之间
        System.out.println(a);
        //填写一个函数随机产生四位的验证码
        char[] arr = {'中','国','传','a','吧','c','e','g'};
        StringBuilder sb = new StringBuilder();
        Random random1 = new Random();
        //需要四个随机数获取字符数组中的字符
        for (int i = 0; i < 4; i++){
            int index = random1.nextInt(arr.length);
            sb.append(arr[index]);
        }
        System.out.println("验证码：" + sb);

    }
}
