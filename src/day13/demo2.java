package day13;

import java.io.IOException;

/**
 * Created by reyren on 2017/1/22.
 */
/*RunTime该类代表了应用程序的运行环境
    getRuntime()返回当前应用程序的运行环境
    exec(String command)根据指定的路径执行对应的可执行文件
    freeMemory()返回jvm空闲的内存，是以字节为单位的
    maxMemory()返回jvm试图使用的最大内存
    totalMemory()返回jvm的内存总量,表示实际上管理的内存总量
* */

public class demo2 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();//其实就是JVM
        /*Process process = runtime.exec("");//相当于启动了进程
        process.destroy();//杀死进程*/

        System.out.println("返回jvm空闲的内存:" + runtime.freeMemory());
        System.out.println("返回jvm试图使用的最大内存:" + runtime.maxMemory());//不会直接问系统要满，会弹性自增长的要的
        System.out.println("返回jvm的内存总量:" + runtime.totalMemory());
    }
}
