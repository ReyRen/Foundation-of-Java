package day16;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by reyren on 2017/3/1.
 */
/*将字符串中的数值进行排序：
    例如String str = "8 10 15 5 2 7"------> "2 5 7 8 10 15"
*
*
* */

public class demo10 {

    public static void main(String[] args) {
        String str = "8 10 15 5 2 7";
        String[] datas = str.split(" ");

        TreeSet tree = new TreeSet();
        for (int i = 0; i < datas.length; i++){
            //tree.add(datas[i]);//添加到TreeSet会自动的将数组拍好序,但是这里出现一个问题就是认为10是比2还小的，因为是1开头的
                                //所以需要将字符串转为int类型再进行比较用到一个方法Integer.parseInt()
            tree.add(Integer.parseInt(datas[i]));
        }

        //遍历treeSet的元素拼接成对应的字符串
        Iterator it = tree.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
