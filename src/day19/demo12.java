package day19;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by reyren on 2017/3/11.
 */

/*需求:指定一个文件夹，列出该文件夹线面所有的java文件
*
* */
public class demo12 {
    public static void main(String[] args) {
        File dir = new File("/Users/reyren/IdeaProjects/Practice/src/day19");
        listJava(dir);
    }

    //列出所有的java文件
    public static void listJava(File dir){
        File[] files = dir.listFiles();//获取到了所有的子文件
        for (File file:
             files) {
            String fileName = file.getName();
            /*if (fileName.endsWith(".java")&&file.isFile()){
                System.out.println(fileName);
            }*/
            if (fileName.matches(".+.java")&&file.isFile()){//.+表示前面是任意字符
                System.out.println(fileName);
            }

        }
    }

    public static void listFile(File dir){
        //获取到所有的子文件
        File[] files = dir.listFiles();
        System.out.println("文件:");
        for (File fileItem:
             files) {
            if (fileItem.isFile()){
                System.out.println("\t" + fileItem.getName());
            }

        }
        System.out.println("文件夹:");
        for (File fileItem:
                files) {
            if (fileItem.isDirectory()){
                System.out.println("\t" + fileItem.getName());
            }

        }
    }

    public static void listJava2(File dir){
        File[] files = dir.listFiles(new MyFilter());//得到文件夹下面的所有文件与文件夹
        for (File file:
             files) {
            System.out.println(file.getName());
        }
    }
}
//自定义一个文件名过滤器
class MyFilter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        //dir是该文件的目录，name文件名
        //System.out.println("文件夹：" + dir + " 文件名:" + name);
        return name.endsWith(".+.java");
    }
}