package day19;

import java.io.File;

/**
 * Created by reyren on 2017/3/11.
 */
/*IO流(Input Output)
*用于解决设备与设备之间的数据传输问题，比如：硬盘的数据读取到内存中，也可以将内存的数据写到硬盘上，还可以把键盘的数据读到内存中
*
* IO技术应用场景：
*   导出报表，上传大头照，下载，解析xml文件
*数据保存到硬盘上，那么该数据就能进行永久性的保存。数据一般是以文件的形式保存到硬盘上的
*
* sun用了一个File类描述文件或文件夹的
*
* File类可以描述一个文件或者文件夹
*
* File类的构造方法
*   File(File parent, String child)根据parent抽象路径名和child路径名字符串创建一个新File实例
*   File(String pathname)通过将给定路径名字符串转换为抽象路径来创建一个File实例
*   File(String parent, String child)
* 目录分隔符：
*   Windows和linux是不一样的
*   要注意：
*       在windows上面\与/都可以使用作为目录分隔符，如果写/的时候，只需要写一个/即可
* */

public class demo7 {
    public static void main(String[] args) {
        //File file = new File("/Users/reyren/Desktop/测试.txt");
        File parentFile = new File(File.separator + "Users/reyren/Desktop/");
        File file = new File(parentFile,"测试.txt");
        System.out.println(file.exists());//判断该文件是否存在，存在TRUE
        System.out.println("当前机器上的目录分隔符：" + File.separator);

    }
}
