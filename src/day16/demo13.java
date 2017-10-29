package day16;

/**
 * Created by reyren on 2017/3/1.
 */
/*需求：填写一个数据的工具类
*
* */

public class demo13 {
    public static void main(String[] args) {
        Integer[] arr = {10,12,14,19};
        myArrays<Integer> arrTool = new myArrays<Integer>();

        arrTool.reverse(arr);

        System.out.println(arrTool.toString(arr));
        //String{} arr2 = {"aaa","bbb","ccc"};因为在创建对象Integer的时候就确定了用Integer类型，所以想要变为String，就必须再创建一次myArrays
        myArrays<String> tool2 = new myArrays<String>();
        String[] arr2 = {"aaa","bbb","ccc"};
        tool2.reverse(arr2);
    }
}
class myArrays<T>{
    //元素反转
    public void reverse(T[] arr){
        for (int startIndex = 0, endIndex = arr.length-1; startIndex < endIndex; startIndex++,endIndex--){
            T temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }

    public String toString(T[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                sb.append("[" + arr[i] + ",");
            }else if (i == arr.length-1){
                sb.append(arr[i] + "]");
            }else{
                sb.append(arr[i] + ",");
            }
        }
        return sb.toString();
    }
}