package day22;

import java.io.File;

/**
 * Created by reyren on 2017/3/18.
 */
/*需求1：列出文件夹的子孙文件与目录
  需求2：列出指定目录的子孙文件和目录名，要求名称前面要有相应的数量的空格
* */

public class demo10 {

    public static void main(String[] args) {
        File dir = new File("/Users/reyren/Desktop/TEST");
        //listFiles(dir);
        listFiles2(dir,"");
    }

    //列出一个文件夹的子孙文件和目录
    public static void listFiles(File dir){
        File[] files = dir.listFiles();//列出了所有的子文件
        for (File file:
             files) {
            if (file.isFile()){
                System.out.println("文件名:" + file.getName());
            }else if (file.isDirectory()){
                System.out.println("文件夹:" + file.getName());
                listFiles(file);
            }
        }
    }

    public static void listFiles2(File dir,String space){//space存储的是空格
        File[] files = dir.listFiles();//列出了所有的子文件
        for (File file:
                files) {
            if (file.isFile()){
                System.out.println(space + file.getName());
            }else if (file.isDirectory()){
                System.out.println(space + file.getName());
                listFiles2(file,"  "+space);
            }
        }
    }

}
