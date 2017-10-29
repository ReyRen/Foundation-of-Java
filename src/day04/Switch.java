package day04;

import java.util.Scanner;

/**
 * Created by reyren on 2016/9/26.
 */

/*
* switch 语句要注意的事项：
*       1.switch 语句使用的变量只能是byte, char, short, int, String数据类型
*       2.case后面跟的数据必须是一个常量
*       3.swith语句的停止条件:
*           switch 语句一旦匹配上了其中的一个case,那么就会执行对应的case中的语句，执行完毕之后如果没有遇到break关键字或者或结束switch
*           语句的大括号，那么switch语句就不会再判断，按照代码的顺序从上往下执行所有代码。直到遇到Break或者结束switch的大括号为止。
*       4.在switch语句中不管代码的顺序如何，永远都会先判断case语句，然后没有符合的情况下才会执行default语句
*
*
*
*
* */

//接受键盘录入一个季节，根据对应的数字输出对应的季节  345(春)...



public class Switch {

    public static void main(String[] args){

        System.out.println("请输入一个月份： ");

        //创建扫描器
        Scanner scanner = new Scanner(System.in);

        //调用扫描器的nextInt方法
        int month = scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("没有对应的季节");
        }
    }
}
