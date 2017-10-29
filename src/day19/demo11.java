package day19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by reyren on 2017/3/11.
 */
/*获取的方法：
    getName()获取文件或文件夹的名称，不包含上级路径
    getPath()返回绝对路径，可以是相对路径，但是目录要指定
    getAbsolutePath()获取文件的绝对路径，与文件是否存在没有关系
    length()获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L
    getParent()返回此抽象路径名父目录的路径名字符串，如果此路径没有指定父目录，则返回null
    lastModified()获取最后一次被修改的时间
    文件相关
    static File[] listRoots()列出所有的根目录（Windows中就是所有系统的盘符）
    list()返回目录下的文件或者目录名，包含隐藏文件，对于文件这样操作会返回null
    list(FilenameFilter filter)返回指定当前目录中符合过滤条件的子文件或子目录，对于文件这样操作会返回null
    listFiles()返回目录下的文件或者目录对象（File类实例）包含隐藏文件，对于文件这样操作会返回null
    listFiles(FilenameFilter filter)返回指定当前目录中符合过滤条件的子文件或目录，对于文件这样操作会返回null
*
* */

public class demo11 {
    public static void main(String[] args) {
        /*File file = new File("/Users/reyren/Desktop/TEST/test.txt");
        System.out.println("文件名是：" + file.getName());//根本就不判断是否存在，直接就把上面的参数切割获取下来了
        System.out.println("获取文件大小:" + file.length());
        //使用mm值转换成date对象
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println("获取最后一次修改时间" + dateFormat.format(date));*/

        /*File[] roots = File.listRoots();
        for (File file:roots){
            System.out.println(file);
        }*/

        File file = new File("/Users/reyren/Desktop/TEST/");
        /*String[] filenames = file.list();//把当前文件夹下面的所有子文件名和文件夹名存储到一个String类型的数组中返回
        for (String fileName:
             filenames) {
            System.out.println(fileName);
        }*/

        File[] files = file.listFiles();//把当前文件夹下面的所有子文件与文件夹都使用了一个File对象描述，然后把这些File对象存储到一个File数组中返回给你
        for (File fileItem:
             files) {
            System.out.println("文件名:" + fileItem.getName());
        }
    }
}
