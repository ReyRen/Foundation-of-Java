package day11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by reyren on 2016/12/17.
 */
/*
* finally块释放资源的代码
* */
public class demo5 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try{
            //找到目标文件
            File file = new File("/Users/reyren/Desktop/测试.txt");
            //建立程序与文件的数据通道
            fileReader = new FileReader(file);
            //读取文件
            char[] buf = new char[1024];
            int length = 0;
            length = fileReader.read(buf);
            System.out.println("读取到的内容：" + new String(buf, 0, length));
            //如果在这里关闭资源，上面读取的过程中出现异常，就一直关闭不了
        }catch (IOException e){
            System.out.println("读取资源文件失败...");
        }finally {
            try {
                fileReader.close();//close也抛出个IO异常
                System.out.println("释放资源文件成功");
            }catch (IOException e){
                System.out.println("释放资源失败");
            }

        }


    }
}
