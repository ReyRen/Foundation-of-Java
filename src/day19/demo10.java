package day19;

import java.io.File;

/**
 * Created by reyren on 2017/3/11.
 */
/*
* 删除：
*   delete()删除文件或一个空文件夹，如果文件夹不为空，则不能删除，成功返回true，失败返回false
*   deleteOnExit()在虚拟机终止时，请求删除此抽象路径名表示的文件或路径，保证程序异常时创建的临时文件也可以被删除
*
*区别：
*   delete()马上删除
*   后者是jvm退出删除（虽然此程序执行完就是jvm退出），一般用于删除写临时文件
*
*判断方法：
*   exists()文件或文件夹是否存在
*   isFile()是否是一个文件，如果不存在，则始终未false
*   isDirectory()是否是一个目录，如果不存在，则始终未false
*   isHidden()是否是一个隐藏的文件或是否是隐藏的目录
*   isAbsolute()测试此抽象路径名是否是绝对路径
* */

public class demo10 {
    public static void main(String[] args) {
        File file = new File("/Users/reyren/Desktop/TEST/test.txt");
        System.out.println("存在吗?" + file.exists());
        System.out.println("是否是一个文件呢？" + file.isFile());
        System.out.println("是否是一个目录呢?" + file.isDirectory());
    }
}
