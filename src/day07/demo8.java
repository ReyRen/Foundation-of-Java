package day07;

/**
 * Created by reyren on 2016/11/5.
 */
/*
* 编写一个数组的工具类(如果一个函数没有直接访问到非静态的成员时，那么就可以使用static修饰了,一般用于工具类的方法)
*   这样就可以直接用类名访问，方便很多
* */
public class demo8 {
    public static void main(String[] args) {
        int[] arr = {12,1,456,165};
        /*ArrayTool tool = new ArrayTool();
        tool.sort(arr);
        String info = tool.toString(arr);
        System.out.println("数组的元素是：" + info);*/
        ArrayTool.sort(arr);
        String info = ArrayTool.toString(arr);
        System.out.println("数组的元素是：" + info);
    }
}
class ArrayTool{

    //toString方法
    public static String toString(int[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                result += "[" + arr[i] + ",";
            }else if (i == (arr.length-1)){
                result += arr[i] + "]";
            }else {
                result += arr[i] + ",";
            }
        }
        return result;
    }

    public static void sort(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}