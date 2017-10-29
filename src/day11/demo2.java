package day11;

/**
 * Created by reyren on 2016/12/15.
 */
/*需求：模拟去吃木桶饭，如果带钱少于0块，那么就抛出一个没有带够钱的异常对象，如果带够就吃上了
*
* */
public class demo2 {
    public static void main(String[] args) {
        try{
            eat(9);
        }catch (NoMoneyException e){
            e.printStackTrace();
            System.out.println("给我洗碗一个月");
        }
    }
    public static void eat(int money) throws NoMoneyException{
        if(money < 10){
            throw new NoMoneyException("吃霸王餐");
        }
        System.out.println("吃上饭了");
    }

}

//定义一个没钱的异常
class NoMoneyException extends Exception{
    public NoMoneyException(String message) {
        super(message);
    }
}
