package day06;

import java.util.Arrays;

/**
 * Created by reyren on 2016/11/2.
 */

/*
* 目前存在数组，int[] arr = {0,0,12,1,0,4,6,0},编写一个函数接收该数组，然后把数组的0清空，然后返回一个不存在0元素的数组
* */
public class clearZero {

    public static void main(String[] args) {

        int[] arr = {0,0,12,1,0,4,6,0};
        arr = cleanZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] cleanZero(int[] arr){
        //统计0的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                count++;
            }
        }

        //创建一个新的数组
        int[] newArr = new int[arr.length-count];
        //把非0得数据存储在新的数组中

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        return  newArr;
    }
}
