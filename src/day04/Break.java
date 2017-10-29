package day04;

/**
 * Created by reyren on 2016/10/3.
 */

/*break适用范围：只能用于switch或者是循环语句中
  break作用：
        1.break用于switch语句的作用是结束一个switch语句
        2.break用于循环语句中的作用是结束当前所在的循环语句


  笔试题目：break 目前位于外层的For循环，如何才能让break作用于外层的for循环
*
* */


public class Break {

    public static void main(String[] args){

       /* for (int j = 0; j<3; j++){
            for (int i = 0; i <2; i++){
                System.out.println("hello world");
                break;//结果输出三次
            }
        }*/

        outer: for (int j = 0; j<3; j++){
            inner: for (int i = 0; i <2; i++) {
                System.out.println("hello world");
                break outer;//一次
                }

            }

    }
}
