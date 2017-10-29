package day11;

/**
 * Created by reyren on 2016/12/16.
 */
/*运行时异常：如果一个方法上抛出了一个运行时异常，那么方法上可以声明也可不声明，调用者可以处理也可以不处理
        RuntimeException和RuntimeException的子类都是属于运行异常
  编译时异常：如果一个方法内部抛出一个编译时异常对象，那么方法上就必须要声明而却调用者也必须要处理
        出了运行时异常都是编译时异常
*
* 为什么java编译器会这样？
*   运行时异常都是可以通过程序员良好的编程习惯去避免的，所以java编译器就没有严格要求处理运行时异常
*   编译时异常很多情况下是代码没法避免的
* 注意：
*   在调用一些方法的时候会提示说是抛出处理一下，就是因为这个方法本身抛出了编译时异常
* */
public class demo3 {
    public static void main(String[] args) {
        div(4,0);
    }
    public static void div(int a, int b){
        if (b == 0){
            throw  new ArithmeticException();
        }
        int c = a/b;
        System.out.println("c = " + c);
    }
}
