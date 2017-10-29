package day24;

/**
 * Created by reyren on 2017/3/19.
 */
/*break:用于结束一个循环语句或者是一个switch语句
        作用范围：只能用于循环语句或者是switch语句
  continue:跳过本次循环语句继续下一次循环
            作用范围:只能适用于循环语句
            一旦执行了continue语句，那么在循环体内continue之后的循环语句跳过执行。但是i++还是执行的
  return:是将这个函数都结束掉，即使在循环里面的return，一旦执行return,循环外的语句都不会执行到


  函数重载：在一个类中出现了两个或两个以上的同名函数
        一个函数名能应对各种类型的函数
        要求：
            1.函数名一致
            2.形参列表不一致，个数或对应的类型
            3.与返回值类型无关
   函数重写：子父类出现了同名的函数称为函数的重写，必须是在继承的关系下才存在的
        要求：
            1.子父类的函数与形参列表名必须一致
            2.子类的权限修饰符必须要大于或者等于父类的权限修饰符
            3.子类的返回值类型必须要小于或者父类的返回值类型
            4.子类抛出的异常类型必须要小于或者等于父类抛出的异常类型

   冒泡排序：相邻的两个元素比较，符合条件交换位置

   折半查找法：（二分法）
        数据必须是有序的
        思路：定义三个变量记录最大，最小还有中间的查找范围索引值，每次都是使用中间索引值与要查找的目标进行对比，如果不是符合的目标那么就缩小查找的范围



    匿名对象：没有引用类型变量指向的对象就是匿名对象
        主要作用简化书写
        两种应用场景：1.如果一个对象的方法只会调用一次的时候，然后该对象就不再使用了，这时候就可以使用匿名对象
                    2.作为参数传递


    封装：
        封装的步骤：
            1.私有化要封装的属性
            2.根据需求提供对应的get或set方法
        封装的好处：
            1.提高了数据的安全性，相当于能通过setget来进行过滤一把
            2.操作简单
            3.隐藏了实现
        封装一定会用上的场景：
            如果是实体类的成员属性，在显示开发中全部都封装起来



     构造代码块：创建一个对象的时候，给对象进行统一的初始化工作
        应用场景：如果创建任意对象的时候都必须调用某个方法为该对象进行初始化时就可以使用构造代码块
     静态代码块：所属的类被加载到内存的时候执行的
        应用场景：主要用于准备一个项目的初始化工作，比如从配置文件中读取数据库的用户名与密码



     isntanceof 判断指定的对象是否属于某种类别
     isntanceof 使用前提：判断的对象与类别必须存在继承或者实现的关系
     instanceof 使用格式：对象 instanceof 类别
* */

public class demo1 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++){
            System.out.println(i);
            continue;
        }

        for (int i = 0; i < 5; i++){
            System.out.println("hello");
            break;//整个循环都会结束掉
        }*/

        /*int[] arr = {2,5,10,8,1};//所谓的排序就是将一个个的最大的元素放在对应的位置上
        for (int j = 0; j < arr.length-1;j++){//控制的是轮数，每一轮都会找出最大的元素
            //把最大值放在最后一个位置
            for (int i = 0; i < arr.length-1-j;i++){//控制的是相邻两个元素的比较
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }*/

        /*int[] arr = {12,15,17,19,30};
        int index = halfSearch(arr,19);
        System.out.println(index);*/

    }
/*
    public static int halfSearch(int[] arr,int target){
        int max = arr.length-1;
        int min = 0;
        int mid = (max+min)/2;
        while (true){
            if (target>arr[mid]){
                min = mid+1;
            }else if (target<arr[mid]){
                max = mid - 1;
            }else {
                return mid;
            }

            //重新计算中间值
            mid = (min+max)/2;

            //找不到
            if(max<min){
                return -1;
            }
        }
    }*/
}
class Baby{
    int id;
    String name;

    {
        cry();//构造代码块的代码是在构造函数中执行的，一编译就自动写下去了
    }

    public Baby(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Baby(){

    }

    @Override
    public String toString() {
        return "编号：" + this.id + " 姓名:" + this.name;
    }

    public void cry(){
        System.out.println("哭....");
    }
}