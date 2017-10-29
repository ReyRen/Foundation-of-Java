package day22;

/**
 * Created by reyren on 2017/3/18.
 */
/*递归：函数的自身调用了自身
递归的使用前提：必须是有条件的情况下调用

需求：算出5的阶乘
*
* */

public class demo9 {
    public static void main(String[] args) {
        int result = print(5);
        System.out.println(result);
    }

    public static int print(int num){
        if (num == 1){
            return 1;
        }else {
            return num*print(num-1);
        }
    }
}
