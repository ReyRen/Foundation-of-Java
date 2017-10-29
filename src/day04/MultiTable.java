package day04;

/**
 * Created by reyren on 2016/10/21.
 */
/*
*   定义一个函数判断一个分数的等级，把分数的等级返回给调用者
*
*   定义一个函数打印一个乘法表。不需要返回任何数据
* */


public class MultiTable {
    public static void main(String[] args){
        String result = getGrade(89);
        System.out.println(result);

        print(7);

    }

    public static String getGrade(int score){
        String grade = "";
        if (score >= 90 && score <= 100){
            grade = "A等级";
        }else if (score >= 80 && score <= 89){
            grade = "B等级";
        }else if (score >= 70 && score <= 79){
            grade = "C等级";
        }else if (score >= 60 && score <= 69){
            grade = "D等级";
        }else if (score >= 50 && score <= 59){
            grade = "E等级";
        }else {
            grade = "补考等级";
        }
        return grade;
    }

    public static void print(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
