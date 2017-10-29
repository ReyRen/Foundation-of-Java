package day05;

import java.util.Arrays;

/**
 * Created by reyren on 2016/10/27.
 */
/*数组工具类：
    Arrays
*
* */

public class arrays {

    public static void main(String[] args){
        int[] arr = {12, 3, 1, 10, 8};
        Arrays.sort(arr);//排序

        int index = Arrays.binarySearch(arr, 9);//二分查找,但是一定要提前排序

        String info = Arrays.toString(arr);

        System.out.println("数组元素：" + info);
        System.out.print("查找的索引值：" + index);


    }
}
