package day04;

/**
 * Created by reyren on 2016/10/10.
 */


/*
*
* continue关键字
*
*   适用范围：只能用于循环语句
*   作用：跳过本次的循环体内容,注意只是循环体内的内容，for循环的i++不属于循环体的内容，继续下一次
*   注意事项：
*       1.在一种情况下，continue后面不能跟有其他语句，因为永远无法执行到。
*       2.continue也能配合标志
*
* */
public class Continue {

    public static void main (String[] args){

        for (int i = 0; i < 5; i++){
            if (i == 1){
                continue;
            }
            System.out.println("hello" + i);

        }

       /*outer:for (int i = 0; i < 3; i++){
           inner:for (int j = 0; j < 2; j++){
               System.out.println("hello");
               continue outer;
           }
       }*/

       //计算1-100的偶数的总和
        /*int sum = 0;
        for (int num = 1; num <= 100; num++){
            if(num % 2 != 0){
                continue;  //如果是基数就跳过本次循环
            }
            sum = sum + num;
        }
        System.out.println(sum);*/
    }
}
