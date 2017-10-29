package day16;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by reyren on 2017/2/25.
 */
/*使用LinkedList存储一副扑克牌实现洗牌的功能
*
* */

public class demo1 {
    public static void main(String[] args) {
        LinkedList pokers = creatPoker();
        shufflePoker(pokers);
        showPoker(pokers);

    }

    //生成poker的方法
    public static LinkedList creatPoker(){
        //该集合用于存储扑克对象
        LinkedList list = new LinkedList();
        //定义数组存储所有的花色和点数
        String[] colors = {"黑桃","红桃","梅花","方块"};
        //定义数组存储所有的点数
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < colors.length; j++){
                list.add(new Poker(colors[j],nums[i]));//将一张牌放到集合中去
            }
        }
        return list;
    }

    //显示poker的方法
    public static void showPoker(LinkedList pokers){
        for (int i = 0; i < pokers.size(); i++){
            System.out.print(pokers.get(i));
            if (i%10==9){
                System.out.println();
            }
        }
    }


    //洗牌功能
    public static void shufflePoker(LinkedList pokers){
        //创建随机数对象
        Random random = new Random();
        for (int i = 0; i < 100; i++){//随机抽取一百次
            //随机产生两个索引值
            int index1 = random.nextInt(pokers.size());
            int index2 = random.nextInt(pokers.size());
            //根据索引值取出两张牌，然后交换两张牌的顺序
            Poker poker1 = (Poker) pokers.get(index1);
            Poker poker2 = (Poker) pokers.get(index2);
            pokers.set(index1,poker2);//将poker2的索引换成index1
            pokers.set(index2,poker1);
        }

    }
}

//扑克类
class Poker{
    String color;//花色
    String num;//点数

    public Poker(String color, String num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return "{" + this.color+this.num + "}";
    }
}