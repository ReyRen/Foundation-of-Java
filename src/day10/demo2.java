package day10;

/**
 * Created by reyren on 2016/11/16.
 */
/*
* 实现关系下的多态：
*   接口  变量 = new 接口实现类的对象
* */
public class demo2 {
    public static void main(String[] args) {
        //实现关系下的多态
        Dao d = new UserDao();//接口的引用类型变量指向了接口实现类的对象
        d.add();
    }
}

interface Dao{
    public abstract  void add();
    public abstract void delete();
}
class UserDao implements Dao{

    public void add() {
        System.out.println("添加成功");
    }


    public void delete() {
        System.out.println("删除成功");
    }
}