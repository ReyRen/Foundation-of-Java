package day12;

/**
 * Created by reyren on 2017/1/16.
 */

/*实现自己的trim方法
*
* */
public class demo6 {
    public static void main(String[] args) {
        String str = "      中 国     ";
        System.out.println(myTrim(str));

    }

    public static String myTrim(String str){
        //先转换成字符数组
        char[] arr = str.toCharArray();
        //定义两个变量定义开始与结束的索引值
        int startIndex = 0;
        int endIndex = arr.length-1;
        while(true){
            if (arr[startIndex] == ' '){
                startIndex++;
            }else
                break;
        }
        while(true){
            if (arr[endIndex] == ' '){
                endIndex--;
            }else
                break;
        }
        //截取子串返回
        return str.substring(startIndex, endIndex+1);
    }
}
