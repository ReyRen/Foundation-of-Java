package day12;

import java.util.Arrays;

/**
 * Created by reyren on 2017/1/16.
 */
/*求一个子串在整穿中出现的次数
*
* */
public class demo8 {
    public static void main(String[] args) {
        String str = "sdajsasjavadsnajdjavadnasaoandjavajdn";
        getCount(str,"java");
    }

    //统计子串出现的次数
    public static void getCount(String str, String target){
        int count = 0;//用于记录出现的次数的
        int fromIndex = 0;//记录从哪个索引开始寻找目标子串的
        while((fromIndex = str.indexOf(target, fromIndex))!=-1){
            //如果返回的不是-1说明已经找到目标元素
            count++;
            fromIndex = fromIndex + target.length();

        }
        System.out.println("出现的次数" + count);

    }
}
