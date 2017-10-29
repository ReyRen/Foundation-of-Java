package day08;

/**
 * Created by reyren on 2016/11/6.
 */
/*球员---->球队 整体与部分的关系
  学生---->人  继承的关系
*
* */
public class demo3 {
    public static void main(String[] args) {
        Player p1 = new Player(12, "梅西");
        Player p2 = new Player(7, "C罗");
        Player p3 = new Player(11, "内马尔");

        //球队
        Team t = new Team("恒大", p1, p2, p3);
        t.startGame();
        System.out.println("名字：" + t.p2.name);
    }
}
//球员
class Player{
    int num;//编码

    String name;

    public Player(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public void run(){
        System.out.println(name + "跑");
    }
}
//球队
class Team{

    String name;

    Player p1; //球员1.。。
    Player p2;
    Player p3;

    public Team(String name, Player p1, Player p2, Player p3) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //开始比赛
    public void startGame(){
        System.out.println(name + "开赛了");
    }
}