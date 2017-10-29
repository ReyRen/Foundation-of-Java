package day06;


/**
 * Created by reyren on 2016/11/2.
 */

/*使用java类描述一个计算器类，计算器具备操作数1.操作数2， 操作数符三个公共的属性，还具备计算的功能行为
*
* */

public class ClassCalcutator {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        c.initCalculator(1,2,'/');
        c.calculate();
    }

}

class Calculator{
    private int num1;
    private int num2;
    char option;

    //设置公共的方法设置属性
    public void initCalculator(int n1, int n2, char o){
        num1 = n1;
        num2 = n2;
        if (o == '+' || o == '-' || o == '*' || o == '/'){
            option = o;
        }else
            option = '+';
    }

    public void calculate(){
        switch (option){
            case '+':
                System.out.println("做加法运算，结果是：" + (num1 + num2));
                break;
            case '-':
                System.out.println("做减法运算，结果是：" + (num1 - num2));
                break;
            case '*':
                System.out.println("做乘法运算，结果是：" + (num1 * num2));
                break;
            case '/':
                System.out.println("做除法运算，结果是：" + (num1 / num2));
                break;
        }
    }
}
