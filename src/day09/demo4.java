package day09;

import java.util.Arrays;

/**
 * Created by reyren on 2016/11/10.
 */
/*如果是不同的引用类型变量操作同一个对象，那么肯定会影响到结果的
*
* 值传递：
*   调用一个方法的时候，传递给方法的变量的实参，实际上传递的只是变量所存储的值
* */

//基本数据类型的值交换
    //需求：定义一个函数交换两个基本类型变量的值
/*public class demo4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        changeValue(a,b);
        System.out.println("a = " + a + " b = " + b);
    }
    public static void changeValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}*/

/*//引用类型的值交换
    //定义一个函数交换数组中两个元素的位置
public class demo4{
    public static void main(String[] args) {
        int[] arr = {23, 10, 9};
        changeArr(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArr(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}*/

public class demo4{
    public static void main(String[] args) {
        Person p = new Person();
        changeObj(p,20);
        System.out.println(p.x);
    }
    public static void changeObj(Person p, int x){
        p.x = x;
    }
}
class Person{
    int x = 10;
}
