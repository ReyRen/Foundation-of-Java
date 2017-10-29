package day04;

/**
 * Created by reyren on 2016/10/10.
 */


/*
* 函数的定义格式：
*   修饰符  返回值类型  函数名（形参列表）{
*       需要被封装的功能代码
* 函数的特点：
*   1.函数定义好后，是需要被调用才会执行的，main函数是有jvm调用的，不需要我们的手动调用。
*   }
* */

//定义一个函数，比较两个int类型数据的大小，最大值返回给调用者
public class function {

    public static void main(String[] args){
        int max = getMax(4,5);
        System.out.println(max);
    }

    public static int getMax(int a, int b ){
        int max = 0;//定义一个变量用于保存最大值
        if (a > b){
            max = a;
        }else
            max = b;
        return max;

    }
}
