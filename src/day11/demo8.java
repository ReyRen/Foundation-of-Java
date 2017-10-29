package day11;

import java.util.Arrays;

/*这道题目主要是考察你对i++和++i的理解。一旦一条语句中有i++的出现，你可以这样理解，
把i++所在的语句拆分成两条：第一条就是在原语句不变的基础上，去掉++二字；第二句就是i = i+1。
以i++<10为例，即：i<10;i++;。System.out.println(i++);就是：System.out.println(i);i=i+1;。
而对于++i的理解就相对容易了，也是拆分成两条语句：第一条就是i = i + 1;；第二句就是在原语句不变的基础上去掉++二字。

* */
/**
 * Created by reyren on 2016/12/20.
 */
/*目前有数组int[] arr = {11,2,4,2,10,11}
    定义一个函数清除该数组的重复元素，返回的数组不准浪费长度
*
* */
public class demo8 {
    public static void main(String[] args) {
        int[] arr = {11,2,4,2,10,11};
        arr = clearRepeat(arr);
        System.out.println("清除后的新数组" + Arrays.toString(arr));
    }

    public static int[] clearRepeat(int[] arr){
        //先计算出重复元素的个数
        int count  = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        //System.out.println(count);
        //新数组长度
        int newLength = arr.length - count;
        //创建一个新的数组
        int[] newArr = new int[newLength];

        //定义一个变量记录新数组的索引值
        int index = 0;

        //要把旧数组的元素存储到新数组中，存入数组之前要判断该元素是否存在新数组中，存在就不要了
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];//temp就是去除旧数组的元素
            boolean flag = false;//定义一个变量记录当前元素是否为重复元素，默认不是重复元素
            //检查新数组是否存在取出的元素
            for(int j = 0; j < newArr.length; j++){
                if (newArr[j] == temp){
                    flag = true;
                    break;
                }
            }
            //不是重复元素才能存储
            if (flag == false){
                newArr[index++] = temp;//先使用再+1
            }
        }
        return newArr;
    }
}
