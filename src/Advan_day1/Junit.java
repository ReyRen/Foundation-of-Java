package Advan_day1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by reyren on 2017/4/7.
 */
/*Junit(单元测试框架)使用规范:
    1.一个类如果需要测试，那么该类就应该对应着一个测试类，测试类的命名规范：被测试的类的类名+Test作为后缀
    2.一个背测试的方法一般对应着一个测试的方法，测试的方法命名规范，Test+被测试的方法名

 注意：
    1.@Test测试的方法不能是static修饰的与不能带有形参
    2.如果测试一个方法的时候需要准备测试的环境或者是清理测试的环境，那么可以@Before,@After,@BeforeClass,@AfterClass这四个注解
*       @Before,@After,是在测试方法每次测试都会调用，@BeforeClass,@AfterClass是在所有的测试方法测试之前与之后调用一次而已
* */

public class Junit {

    @Test
    public void sort(){
        int[] arr = {12,4,1,19};
        for (int i = 0; i < arr.length-1;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("数组的元素是:" + Arrays.toString(arr));
    }
}
