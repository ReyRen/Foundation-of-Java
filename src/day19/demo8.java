package day19;

import java.io.File;

/**
 * Created by reyren on 2017/3/11.
 */
/*路径问题：
绝对路径：
    该文件在硬盘上的完整路径，绝对路径一般都是以盘符开头的
相对路径：
    相对路径就是资源文件相对于当前程序所在的路径
    .代表当前路径
    ..上一级路径
    ...错误的
 注意：如果程序当前所在的路径与资源文件不是在同一个盘下面，是没法写相对路径的
* */

public class demo8 {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println("当前路径是:" + file.getAbsolutePath());//获取当前路径的绝对路径

        File file1 = new File("../../Desktop/测试.txt");
        System.out.println(file1.exists());
    }
}
