package day16;

/**
 * Created by reyren on 2017/3/1.
 */
/*需求：
    定义一个方法，可以接收任意类型的参数，而且返回值类型必须要与实参的类型一致
*自定义泛型：
*   就是一个数据类型的占位符或者是一个数据类型的变量
*方法上自定义泛型：
*   修饰符 <声明自定义泛型>返回值类型 函数名（使用自定义泛型）{
*
*   }
*
* 在泛型中不能使用基本数据类型，如果使用基本的数据类型，那就只能使用基本数据类型对应包装类型
* int-----Ingeter
* byte----Byte
* short---Short
* long----Long
* double--Double
* boolean-Boolean
* char----Character
*
* 方法泛型注意的事项：
*   1.在方法上自定义泛型，这个自定义泛型的具体数据类型是在调用该方法的时候传入实参是确定的
*   2.自定义泛型只要符合标识符的命名规则即可，但是自定义泛型一般我们都习惯使用大写字母表示。T
*   * */

public class demo12 {
    public static void main(String[] args) {
        String str = getData("aa");//不用像Object那样的话强转
        Integer i = getData(123);
    }

    public static <T>T getData(T o){
        return o;
    }
}
