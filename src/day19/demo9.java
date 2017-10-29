package day19;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.File;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/11.
 */
/*File类常见方法：
    创建：
        createNewFile()在指定位置创建一个空文件，成功就返回true,如果已存在就不创建然后返回false
        mkdir()在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常
        mkdirs()在指定位置创建目录，这会创建目录中所有不存在的目录
        renameTo(File dest) 重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切，剪切时候不能操作非空的文件，移动重命名成功返回true
*
* */

public class demo9 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/reyren/Desktop/TEST/test.txt");
        System.out.println("文件创建成功了吗?" + file.createNewFile());//创建一个指定的文件，如果该文件存在了则不会再创建，如果好没有存在则创建，创建成功返回true否则返回false
        File dir = new File("/Users/reyren/Desktop/TEST");
        System.out.println("创建文件夹成功吗？" + dir.mkdir());//创建一个单级的文件夹
        dir = new File("/Users/reyren/Desktop/TEST/T1/T2");
        System.out.println("创建多级文件夹成功吗？" + dir.mkdirs());

        //renameTo 如果目标文件与源文件是在同一个路径下，那么renameTo的作用是重命名,如果不是在同一个路径下，那么renameTo的作用就是剪切，而且只能操作文件
        File destFile = new File("/Users/reyren/Desktop/TEST/Test.txt");
        System.out.println("重命名成功吗？" + file.renameTo(destFile));

    }
}
