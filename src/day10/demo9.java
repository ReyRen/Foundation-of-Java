package day10;

/**
 * Created by reyren on 2016/12/9.
 */
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day10.demo9.div(demo9.java:16)
	at day10.demo9.main(demo9.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

	这些信息是通过printStackTrace方法打印出来的，那么异常对象从哪里来的？

	jvm运行到a/b这个语句的时候发现b为0在我们现实生活中是属于不正常的情况，jvm一旦发现了这种不正常的情况的时候就会马上创建一个异常对象
	并且会调用这个异常对象的printStackTrace的方法进行处理

	为了让程序执行下去就要异常的处理了：
	方式一：捕获处理
	    格式：try{
	            可能发生异常的代码
	         }catch(捕获的异常类型 变量名){
	            处理异常的代码
	         }
	    注意细节：
	        1.如果try块儿中的代码异常，那么经过了处理之后，try-catch外面的代码能正常的执行
	        2.如果try块中出现了异常的代码，那么在try块中出现异常代码后面的代码是不会执行的
	        3.一个try块儿后面是可以捕获多种异常类型的
	        4.一个try块儿后面是可以捕获多种异常类型的,但是捕获的类型必须从小到大捕获，不然报错
	方式二：抛出处理
*
* */

public class demo9 {
    public static void main(String[] args) {
        int[] arr = null;
        div(4,2,arr);
    }

    public static void div(int a, int b, int[] arr){
        int c = 0;//在外面声明虽然也是局部变量，但是作用的域不一样了，表示这个c的作用域不一样了
        try {
            c = a / b;
            System.out.println(arr.length);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        /*}catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch(NullPointerException e){
            System.out.println("出现了空指针异常");
        }*/
        System.out.println(c);
    }
}
