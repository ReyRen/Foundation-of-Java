package day05;

/**
 * Created by reyren on 2016/10/26.
 */

/* 12 5 17 8 9 将排序
        思路：使用索引值为0的元素与其他位置的元素挨个比较一次，如果有大的，交换位置
* */

public class selectSort {

    public static void main(String [] args){
        int[] arr = {12, 5, 17, 8, 9};
        selectSort(arr);

    }

    public static void selectSort(int[] arr){
        /*//把最大值放在首位
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[0]){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
            }
        }

        //把第二值放在次位
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > arr[1]){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[1];
                arr[1] = temp;
            }
        }

        //老三放三位
        for (int i = 3; i < arr.length; i++){
            if (arr[i] > arr[2]){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[2];
                arr[2] = temp;
            }
        }

        //老四放四位
        for (int i = 4; i < arr.length; i++){
            if (arr[i] > arr[3]){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[3];
                arr[3] = temp;
            }
        }*/
        for (int j = 0; j < arr.length-1; j++) {//让底下这个循环执行上面的四次
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] > arr[j]) {
                    //交换位置
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //遍历数组
        System.out.println("目前数组的元素是：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
