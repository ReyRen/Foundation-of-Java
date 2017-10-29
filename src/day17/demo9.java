package day17;

/**
 * Created by reyren on 2017/3/4.
 */
/*预定义字符
    .任何字符（与行字符可能匹配也可能不匹配）
    \d 数字：【0-9】
    \D 非数字：【^0-9】
    \s 空白字符 【 \t\n\x0B\f\r】
    \S 非空白字符 [^\s]
    \w 单词字符: [a-zA-Z_0-9]
    \W 非单词字符: [^\w]
*注意：任何预定义字符没有加上数量词之前都是只能匹配一个字符而已
*
* 数量词
*   X? X, 一次或一次也没有
*   X* X,零次或多次
*   X+ X, 一次或多次
*   X{n} X,签好n次
*   X{n,}，至少n次
*   X{n,m},至少n次，但是不超过m次
*
*
* 范围词：
*   【abc】a,b或c（简单类）
*    [^bac]任何字符，除了a,b或c（否定）
*    [a-zA-Z]a到z或A到Z，两头的字母包括在内（范围）
*    [a-d[m-p]]a到d或m到p：【a-dm-p】并集
*    [a-z&&[def]]d,e或f（交集）
* */
public class demo9 {
    public static void main(String[] args) {
        /*预定义字符

        System.out.println("任意字符：" + ("%".matches(".")));
        System.out.println("数字字符：" + ("12".matches("\\d")));// \是个特殊字符，所以要表示\必须要\\
        System.out.println("非数字字符：" + ("a".matches("\\D")));
        System.out.println("空白字符：" + (" ".matches("\\s")));
        System.out.println("空白字符：" + ("\r".matches("\\s")));//回车
        System.out.println("非空白字符：" + ("\n".matches("\\S")));
        System.out.println("单词字符：" + ("a".matches("\\w")));
        System.out.println("单词字符：" + ("1".matches("\\w")));
        System.out.println("单词字符：" + ("_".matches("\\w")));
        System.out.println("单词字符：" + ("%".matches("\\w")));
        System.out.println("非单词字符：" + ("%".matches("\\W")));*/

        /*数量词

        System.out.println("?一次或一次都没有" + ("123".matches("\\d?")));//表示出现三次所以false，但是可以是没有的
        System.out.println("* 0次或者多次" + ("12312321".matches("\\d*")));
        System.out.println("+ 至少出现一次" + ("12312321".matches("\\d+")));
        System.out.println("{n} 恰好出现n次" + ("12312321312".matches("\\d{11}")));
        System.out.println("{n,} 至少出现n次" + ("12312321312".matches("\\d{3,}")));
        System.out.println("{n,m} 指定出现次数的范围" + ("12312321312".matches("\\d{3,4}")));*/

        System.out.println("abc".matches("[abc]"));//不管写的多长，没有数量词的配合也只能匹配一个
        System.out.println("abc".matches("[abc]{3}"));//表示必须在[abc]范围之内的
        System.out.println("abc".matches("[^abc]{3}"));//表示任何字符都行就是除了在[abc]范围之外的的
        System.out.println("abc".matches("[a-z]{3}"));//表示字符可以出现在a-z之间



    }
}
