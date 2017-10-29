package day17;

/**
 * Created by reyren on 2017/3/4.
 */
/*正则表达式；用于操作字符串的规则，正则表达式的规则使用了特殊的符号表示
    需求：校验一个qq号
            1.不能以0开头
            2.长度5-11
            3.只能由数字组成
*
* */

public class demo8 {
    public static void main(String[] args) {
        String qq = "1345656";
        System.out.println(qq.matches("[1-9]\\d{4,10}")? "合法qq":"非法qq");

    }
}
