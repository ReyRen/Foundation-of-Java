package day04;

/**
 * Created by reyren on 2016/10/3.
 */

/*转义字符：
        特殊字符用反斜杠使其转换成字符的本身输出，那么使用"\"的字符就是转义字符
        System.out.println("Hello\" world");//hello" world
  常见的转义字符：
        \b  Backspace   退格键
        \t  Tab         制表符(就是为了让一列对其，一般等于四个空格)
        \n  Linefeed    换行
        \r  Carriage Return 回车(把光标移动到一行的首位置上)

        注意：如果在windows系统上操作文件的时候需要换行，是需要\r\n一起使用的。如果是在其他的操作系统上只需\n.


*
* */

//9*9乘法表
public class ESC {

    public static void main(String[] args){

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
