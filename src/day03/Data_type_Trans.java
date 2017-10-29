package day03;

/**
 * Created by reyren on 16/9/22.
 */

/*

    数据类型的转化：
        小数据类型--->大数据类型  自动转换类型
        大数据类型--->小数据类型  强制类型转换
    数据类型转换注意的细节：
        1.凡是byte,short,char数据类型数据在运算的时候都自动换转换成int再运算
        2.两个不同数据类型的数据在运算的时候，结果取决于大的数据类型

 */
public class Data_type_Trans {
    public static void main(String[] args){
/*
        byte b = 11;//8bit
        short s = b;//把b变量存储的值赋予给s.2byte
        int i = s;//4byte
        long l = i;//8byte
        System.out.println(l);
*/
/*
        int i = 10;
       // byte b = i;这样会可能丢失精度
        byte b = (byte) i;
        System.out.println(b);
*/
/*
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);//-128
*/
/*
        //如果是负数，那么最高位肯定是1，正数的二进制最高位是0,负数在计算机中存的是补码
        System.out.println(Integer.toBinaryString(-7));//查看二进制数据
*/
/*
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);
*/
/*
        int i = 10;
        long l = 20;
        i = (int)(i + l);
        System.out.println(i);
*/
        byte b = 10;//一个整数没有加上任何标识的时候，默认是int类型的数据了。
        //10是一个常量，编译器在编译的时候就能够确认常量的值了，byte b = 10, 在编译的时候java编译器检查到10并没有超出byte范围
        //byte b = i;报错。java编译器在编译的时候并不能确认变量所存储的值，变量所存储的值实在运行的时候才在内存中分配空间的。

    }
}
