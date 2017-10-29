package day04;

/**
 * Created by reyren on 2016/9/28.
 */


/*
* 在控制台上打印一个五行五列的矩形。
*
* 在控制台打印正立三角形
*
* 打印一个倒立的直角三角形
*
* */


public class printGraph {

    public static void main(String[] args){

        /*for (int j = 0; j < 5; j++){//将打印的一行的代码再执行五次然后每次换行即可----控制行数
            for (int i = 0; i < 5; i++){ //这个是打印出一行的代码---控制列数
                System.out.print("*");
            }
            //换行
            System.out.println();
        }*/

        /*for (int j = 0; j < 5; j++){
            for (int i = 0; i <= j; i++){
                System.out.print("*");
            }
            //换行
            System.out.println();*/

        for (int i = 0; i <= 5; i++){
            for (int j = 0; j < (5-i); j++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
