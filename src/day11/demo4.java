package day11;

/**
 * Created by reyren on 2016/12/17.
 */
/*finally块：
    使用前提：必须存在try块才能使用
  finally在任何情况下都会执行的，出了在jvm退出的情况下
  finally块非常适合做资源释放的工作，这样子可以保证资源文件在任何情况下都会被释放
*
* */
public class demo4 {
    public static void main(String[] args) {
        div(4,0);
    }

    public static void div(int a, int b){
       try{
           int c = a/b;
           System.out.println(c);
       }catch (Exception e){
           System.out.println("出现了除数为0的异常");
       }finally {
           System.out.println("finally的代码执行了");
       }

    }
}
