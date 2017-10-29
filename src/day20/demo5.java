package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/12.
 */
/*、
* copy图片异常处理
*
* */

public class demo5 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            File inFile = new File("/Users/reyren/Desktop/TEST/1.jpeg");
            File destFile = new File("/Users/reyren/Desktop/TEST/T1/1.jpeg");

            fileInputStream = new FileInputStream(inFile);
            fileOutputStream = new FileOutputStream(destFile);

            int length = 0;
            byte[] buf = new byte[1024];

            while ((length = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,length);
            }
        } catch (IOException e) {
            System.out.println("拷贝图片出错");
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    System.out.println("关闭输出流对象成功");
                }
            } catch (IOException e) {
                System.out.println("关闭输出流对对象失败");
                throw new RuntimeException(e);
            }
            finally {
                try {
                    if (fileInputStream != null){
                        fileInputStream.close();
                        System.out.println("关闭输入资源对象成功");
                    }
                } catch (IOException e) {
                    System.out.println("关闭输入资源对象失败");
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
