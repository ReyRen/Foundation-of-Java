package day16;

import java.util.ArrayList;

/**
 * Created by reyren on 2017/3/1.
 */
/*泛型
是JDK1.5使用的新特性
*好处：
*   将运行时的错误提前至了编译时
*   避免了无谓的强制类型转换
*
*泛型在集合中的常见应用：
*   ArrayList<String> list = new ArrayList<String>();true
*   ArrayList<Object> list = new ArrayList<String>();false  泛型中没有多态这个概念
*   ArrayList<String> list = new ArrayList<Object>();false
*   ArrayList<String> list = new ArrayList();true
*   ArrayList         list = new ArrayList<String>();true,但是还是要强转的，因为其实是没有用上泛型的，还是任意类型数据
*
* 注意：
*   泛型没有多态的概念，左右两边的数据类型必须要一致，或者是只写一变的泛型类型
*   推荐使用两边都写泛型
* */
public class demo11 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();//<String>表示这个容器只能放字符串类型的数据
        list.add("aa");
        list.add("bb");
        list.add("cc");
        //list.add(123);
        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);

        }
    }
}
