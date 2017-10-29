package day11;

/**
 * Created by reyren on 2016/12/19.
 */
/*强调：import ...*是不会影响访问速度的，因为点的最后是类名，.*虽然表示所有的类，但是当一个类加载到内存中的时候，首先访问的是静态代码快
    经测试，当没有单独写上这个类new的时候，是不会调用该类的静态代码块的，所以说是虽然.*但是是使用了类才加载到内存的
    不经常用*只是会导致结构的不清晰，不知道导入的是哪个包中的哪个类了

  java.lang包是默认导入的


  权限修饰符:控制被修饰的成员的范围可见性。
                    (大)public         protected           default(缺省)         (小)private
  同一个类              true               true               true                   true

  同一个包              true               true               true                   false

  子父类                true               true               false                  false

  不同包               true                false              false                  false
*
*
*
* 打jar包,需要使用jdk的jar.exe工具，可以将.class文件打包成jar文件
* 要注意的事项：
*   1.一个程序打完jar包之后必须要在清单文件上指定入口类
*       Main-Class: 包名.类名
*   2.jar包双击运行仅对于图形化界面的程序起作用，对控制台的程序不起作用的
* jar文件的作用
*   1.方便用户快速运行一个项目
*   2.提供工具给别人使用
*
* 如果使用jar包里面的类必须要先设置classpath路径
*
* */
public class demo6 {
    public static void main(String[] args) {

    }
}
