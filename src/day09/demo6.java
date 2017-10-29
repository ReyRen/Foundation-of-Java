package day09;

/**
 * Created by reyren on 2016/11/11.
 */
/*接口的作用：
    1.拓展功能
    2.定义约束规范
    3.程序的解耦
* */
public class demo6 {
    public static void main(String[] args) {
        PencliWithEraser p = new PencliWithEraser("2B铅笔");
        p.write();
        p.remove();
    }
}
//普通铅笔类
class Pencil{
    String name;

    public Pencil(String name) {
        this.name = name;
    }

    public void write(){
        System.out.println(name + "唰唰的写");
    }
}
//橡皮接口
interface Eraser{
    public abstract void remove();
}
//带橡皮的铅笔
class PencliWithEraser extends Pencil implements Eraser{
    public PencliWithEraser(String name) {
        super(name);
    }

    public void remove(){
        System.out.println(name + "涂改");
    }
}