package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by reyren on 2016/9/28.
 */

/*
* 1.计算1---100,7的倍数的总和
* 2.实现猜数字游戏,如果没有猜对，可以继续输入你猜的数字，如果猜对了，停止程序
*
*
*
*
*
* */


public class Guess {

    public static void main(String[] args){


       /* int num = 1;
        int sum = 0; //定义一个变量存储每次相加的总和
        while (num <= 100){
            if (num % 7 == 0){
                sum = sum + num;
            }
            num++;
        }*/

        //创建随机数对象
        Random random = new Random();
        //调用随机数对象的nextInt方法，产生一个随机数
        int randomNum = random.nextInt(10)+1;//nextInt(11)产生0到10之间的随机数
        //创建一个扫描器对象
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("请输入您要输入的数字：");
            //调用扫描器的nextInt方法扫描一个数字
            int guessNum = scanner.nextInt();

            if (guessNum > randomNum) {
                System.out.println("猜大了");
            } else if (guessNum < randomNum) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜对了");
                flag = false;
            }
        }
    }
}
