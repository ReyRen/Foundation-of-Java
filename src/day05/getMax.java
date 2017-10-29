package day05;

/**
 * Created by reyren on 2016/10/26.
 */

/*
* 定义一个函数接收一个int类型的数组对象，找出数组对象中的最大元素返回给调用者
*
* */
public class getMax {

   public static void main(String[] args){
       int[] arr = {12, 14, 5, 26,4};
       int max = getMax(arr);
       System.out.println(max);

   }

   public static int getMax(int[] arr){
       int max = arr[0];
       for (int i = 1; i < arr.length; i++){
           if (arr[i] > max){
               max = arr[i];
           }
       }
       return max;
   }
}
