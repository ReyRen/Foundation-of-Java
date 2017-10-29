package day05;

/**
 * Created by reyren on 2016/10/27.
 */

/*
* 定义一个函数，接收一个数组对象和一个要查找的目标元素，函数要返回该目标元素在数组中的索引值，如果目标元素不在数组中，那么返回-1
*
* 二分查找：
*   思路：定义三个变量分别记录要查找元素的范围最大的索引值，最小索引值，中间的索引值每次都是使用中间的索引值的元素与目标元素比较一次
*         如果不是我们所需要的元素，那么缩小查找的范围
* */

public class halfSearch {

    public static void main(String[] args){
        int[] arr = {12, 16, 19, 23, 54};
        int index = halfSearch(arr, 116);
        System.out.println("元素索引值是：" + index);
    }

    public static int halfSearch(int[] arr, int target){
        //定义三个变量，分别记录最大最小中间的索引值
        int max = arr.length-1;
        int min = 0;
        int mid = (max+min)/2;//注意只取整数位
        while(true){
            if (target > arr[mid]){
                min = mid + 1;
            }else if (target > arr[mid]){
                max = mid -1;
            }else{
                return mid;
            }
            //没有找到的情况
            if (max < min){
                return -1;
            }
            mid = (max+min)/2;
        }
    }

    public static int searchEle(int[] arr, int target){//target是目标元素
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;

    }
}
