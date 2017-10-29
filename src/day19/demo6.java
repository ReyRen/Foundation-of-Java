package day19;

/**
 * Created by reyren on 2017/3/8.
 */
/*switch使用的数据类型：byte/char/short/int/String/枚举
在case语句后面跟着的枚举值，只需要单写枚举值即可，不需要再声明该枚举是哪个枚举类的
* */

public class demo6 {
    public static void main(String[] args) {
        Season season = Season.winter;
        switch (season){
            case spring:
                System.out.println("春天...");
                break;
            case summer:
            System.out.println("夏天...");
            break;
            case autum:
            System.out.println("秋天...");
            break;
            case winter:
            System.out.println("冬天...");
            break;
        }

    }
}
//季节枚举类
enum Season{
    spring,summer,autum,winter;
}