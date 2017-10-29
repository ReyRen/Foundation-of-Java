package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by reyren on 2017/3/12.
 */
/*IO异常的处理：
*
* *
*/
public class demo4 {
    public static void main(String[] args) {
        readTest();
    }

    public static void readTest()  {

        FileInputStream fileInputStream = null;
        try {
            File file = new File("/Users/reyren/Desktop/TEST/Test.txt");

            fileInputStream = new FileInputStream(file);

            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = fileInputStream.read(buf)) != -1){
                System.out.println(new String(buf,0,length));
            }
        } catch (IOException e) {
            //处理：要组织后面的代码执行，还要通知调用者这里出错了
            System.out.println("读取文件资源出错。。。");
            throw new RuntimeException(e);//把IOException传递给RuntimException 包装一层再抛出，这样做的目的是为了让调用者使用变得更加的灵活，不要readTest throw一遍，main调用再处理一遍
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                    System.out.println("\r\n关闭资源成功");
                }
            } catch (IOException e) {
                System.out.println("关闭资源失败...");
                throw new RuntimeException(e);
            }
        }


    }
}
