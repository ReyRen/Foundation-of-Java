package day10;

/**
 * Created by reyren on 2016/12/10.
 */
/*抛出处理：
    throw和throws关键字
  抛出异常要注意的细节：
    1.如果一个方法的内部抛出了一个异常对象，那么必须在方法上声明抛出
    2.如果调用了一个声明抛出异常的方法，那么调用者必须要处理异常
    3.如果一个方法内部抛出了一个异常对象，那么throw语句后面的代码都不会再执行了
    4.在一种情况下只能抛出一种类型的异常对象
  throw与throws关键字：
    1.throw是用于方法内部的，throws是用于方法声明上的
    2.throw适用于方法内部抛出一个异常对象的，throws是用于在方法声明上声明抛出异常类型的
    3.throw关键字只能由一个异常对象，throws后面可以一次声明抛出多种类型的异常的
*
* 何时使用抛出处理何时使用捕获处理？
*   如果需要通知到调用者你的代码出了问题这时候就用使用抛出处理
*   如果代码是直接与用户打交道的遇到异常千万不要再抛，再抛就给了用户了，这时候就应该用捕获处理
* */
public class demo10 {
    public static void main(String[] args) {
        //div(4,0);//调用了一个声明抛出异常类型的方法
        try {
            div(4,0);
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }

    public static void div(int a, int b) throws Exception, NullPointerException{
        if(b == 0){
            throw new Exception();//抛出一个异常对象
        }
        int c = a/b;
        System.out.println(c);
    }
}
