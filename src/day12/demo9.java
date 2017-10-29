package day12;

/**
 * Created by reyren on 2017/1/16.
 */
/*字符串有个特点：是个常量，一旦创建就不能修改了
                字符串的内容一旦发生了变化，马上会创建一个新的对象
  注意：字符串的内容不适宜频繁修改，因为一旦修改就会马上创建一个新的对象（在内存中会有非常多的对象）

  如果需要频繁修改字符串的内容，建议使用字符串缓冲类

  StringBuffer其实就是字符串的容器

  笔试题目：使用Stringbuffer无参的构造函数创建一个对象时，默认的初始容量是多少？如果长度不够，自动增长多少？

        StringBuffer底层是依赖了一个字符数组才能存储字符数据的，该字符数组默认的初始容量是16，如果字符数组的长度不够使用，自动增长1倍
*
* 添加数据：
*       append();
*
* 容器具备的行为：
*
*       增加
*           append(boolean b)可以添加任意类型的数据的，有很多的重载
*           insert(int offset, boolean b)可以插入任意类型的数据
*
*
*       删除
*           delete(int start, int end)根据指定的开始与结束的索引值删除对应的内容
*           deleteCharAt(int index)根据指定的索引值删除一个字符
*
*       修改
*           ensureCapacity(int minimumCapacity)指定StringBuffer内部的字符数字长度的
*           replace(int start, int end, String str)根据指定的开始与结束的索引值替换成指定的内容
*           reverse()翻转内容
*           setCharAt(int index, char ch)把指定索引值的字符替换成指定的字符
*           substring(int start, int end)根据指定的索引值截取子串
*
*
*       查看
*           indexOf(String str, int fromIndex) 查找指定的字符串第一次出现的索引值,并且指定开始查找的位置
*           capacity()查看当前字符数组的长度
*           charAt(int index)
*           lastIndexOf(String str)
*           length()查看存储字符的个数
*           toString()把字符串缓冲类的内容转换成字符串返回
*
* StringBuffer与StringBuilder的相同点与不同点：
*   相同点：
*       1.都是字符串缓冲类
*       2.两个类的方法都是一致的
*   不同点：
*       1.StringBuffer是线程安全的（操作效率低），StringBuilder是线程非安全的
*       2.StringBuffer是jdk1.0出现的，StringBuilder是jdk1.5出现的
* 推荐使用StringBuilder
*           在现实生活中很少出现多线程操作一个字符串
*
* */
public class demo9 {
    public static void main(String[] args) {
       /* //先使用StringBuffer无参的构造函数创建一个字符串缓冲区
        StringBuffer sb = new StringBuffer();
        sb.append("java");
        sb.append("java");
        sb.append("java");
        sb.append("java");
        sb.append("java");
        System.out.println(sb);*/

       StringBuffer sb = new StringBuffer();
        sb.append("abc");
        /*添加
        sb.append(true);
        *
        * */

        //插入
        sb.insert(2, "小明");

        /*//删除
        sb.delete(2, 4);//删除小明，记住包头不包尾
        sb.deleteCharAt(3);
        */

        /*修改
        sb.replace(2,4,"小狗");
        sb.reverse();
        sb.setCharAt(2,'红');
        String subString = sb.substring(2, 4);
        System.out.println("子串的内容是：" + subString);
        sb.ensureCapacity(20);//一般不用，因为StringBuffer的一个构造函数就能指定容量*/

        sb.append("abcjavaabc");
        int index = sb.indexOf("abc",0);
        System.out.println("索引值为：" + index);
        System.out.println("查看字符数组的长度" + sb.capacity());//16,这里不是查看存储的字符的长度，而是看当前StringBuffer的容量

        System.out.println("字符串缓冲类内容是：" + sb);
    }
}
