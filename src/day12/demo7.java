package day12;

/**
 * Created by reyren on 2017/1/16.
 */
/*获取上传文件名："D:\\20120512\\dya12\\emo1.java"
*
* */
public class demo7 {

    public static void main(String[] args) {
        String str = "D:\\20120512\\dya12\\emo1.java";
        getFileName(str);

        System.out.println("翻转后的字符串:" + reverse(str));

    }

    public static void getFileName(String path){
        int index = path.lastIndexOf("\\");//第一个\是转义的意思
        String fileName = path.substring(index+1);
        System.out.println("文件名:" + fileName);
    }

    public static String reverse(String str){
        char[] arr = str.toCharArray();
        for (int startIndex = 0, endIndex = arr.length - 1; startIndex < endIndex; startIndex++, endIndex--){
            char temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        //使用字符数组构建字符串
        return new String(arr);

    }
}
