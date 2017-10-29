package day05;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by reyren on 2016/10/27.
 */

/*
* 定义一个函数接收一个char类型的数组对象，然后翻转数组中的元素
* */
public class reverse {

    public static void main(String[] args){

        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        reverse(arr);
    }

    public static void reverse(char[] arr){

        for (int startIndex = 0, endIndex = arr.length-1; startIndex < endIndex; startIndex++, endIndex--){
            char temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }

        //遍历
        System.out.print("目前的元素是：");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
    }
}
