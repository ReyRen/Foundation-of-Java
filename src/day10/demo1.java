package day10;

/**
 * Created by reyren on 2016/11/14.
 */
/*目前多态情况下不能访问子类特有的成员

如果需要访问子类特有的成员，需要进行类型强制转化

引用数据类型的转换：
    小---->大  自动类型转换
    大---->小  强制类型转换
*
* */
public class demo1 {
    public static void main(String[] args) {
        /*
        * 接day09的代码
        * Animal a = new Mouse("老鼠");
        * //调用子类特有的方法
        * a.dig();//不可以
        *
        *Mouse m = (Mouse)a;
        * a.dig()//这样就可以了
        *
        *
        * //需求：定义一个函数可以接收任意类型的动物对象，在函数内部要调用到动物特有的方法
        *
        * main{
        *   Mouse m = new Mouse("老鼠")；
        *   Fish f = new Fish("鱼")；
        *
        *   print(m);
        *   print(f);
        * }
        *
        * public static void print(Animal a){
        *   if(a instanceof Fish){
        *       Fish f = (Fish)a;
        *       f.bubble();
        *   }else if(a instanceof Mouse){
        *       ..
        *   }
        * }
        *
        * */
    }
}
