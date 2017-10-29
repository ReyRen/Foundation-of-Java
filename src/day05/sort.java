package day05;

/**
 * Created by reyren on 2016/10/26.
 */

/*
* 最大值放在数组中的最后一位
*       思路:相邻的两个元素挨个比较，大的元素放在右边，小的左边
* */


public class sort {
    public static void main(String[] args){
        int[] arr = {12, 8, 17, 5, 9};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr){
        /*//把老大放在最后
        for (int i = 0; i < arr.length-1; i++){//i只允许来到3这样+1就是和第四个比
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }

        //把老二放在倒数第二个位置
        for (int i = 0; i < arr.length-2; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }

        //把老三放在倒数第三个位置
        for (int i = 0; i < arr.length-3; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }

        //把老四放在倒数第四个位置
        for (int i = 0; i < arr.length-4; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }*/
        for (int j = 0; j < arr.length-1; j++) {//控制轮数的
            for (int i = 0; i < arr.length - 1 - j; i++) {//i只允许来到3这样+1就是和第四个比
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

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
