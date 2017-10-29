package day10;

/**
 * Created by reyren on 2016/12/6.
 */
/*实现关系下的匿名内部类

实际开发中都是用作实参传递简化书写
* */
public class demo6 {
    public static void main(String[] args) {
       /* outer outer = new outer();
        outer.print();*/

       test(new Dao2() {

           public void add() {
               System.out.println("添加成功2");
           }


       });
    }

    //调用这个方法一次
    public static void test(Dao2 d){//形参类型是一个接口引用
        d.add();
    }
}
interface Dao2{
    public void add();
}

class outer{
    public void print(){
        //创建一个匿名内部类的对象
        new Dao2(){
           public void add(){
               System.out.println("添加成功");
           }
        }.add();
    }
}