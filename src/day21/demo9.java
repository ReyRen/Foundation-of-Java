package day21;

/**
 * Created by reyren on 2017/3/15.
 */
/*一家三口都会工作，儿子的工作就是画画，母亲的工作就是在儿子的基础上做一个增强，不单可以画画，还可以上涂料，
爸爸的工作就是在妈妈的基础上增强，就是上画框
*
* */

public class demo9 {
    public static void main(String[] args) {
        Son son = new Son();
        son.work();
        Mother mother = new Mother(son);
        mother.work();
        Father father = new Father(mother);
        father.work();
    }
}
interface Work{

    public void work();
}
class Son implements Work{
    @Override
    public void work() {
        System.out.println("画画。。。");
    }
}
class Mother implements Work{
    //需要被增强的类
    Work worker;

    public Mother(Work worker){
        this.worker = worker;
    }
    @Override
    public void work() {
        worker.work();
        System.out.println("给画上颜色...");
    }
}
class Father implements Work{
    //需要被增强的类的引用
    Work worker;

    public Father(Work worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        worker.work();//上画框之前先增强一下
        System.out.println("上画框...");
    }
}