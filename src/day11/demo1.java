package day11;

/**
 * Created by reyren on 2016/12/15.
 */
/*自定义异常类：自定义一个类继承Exception即可
*
* */
public class demo1 {
    public static void main(String[] args) {
        String ip = "192.168.10.100";
        ip = null;
        try{
            feiQ(ip);
        }catch (NoIpException e){
            e.printStackTrace();
            System.out.println("马上插上网线");
        }
    }
    public static void feiQ(String ip) throws NoIpException{
        if (ip == null){
            throw new NoIpException("没有插网线");
        }
        System.out.println("正常显示好友的列表");
    }
}
//定义了一个没有网线的异常类
class NoIpException extends Exception{
    public NoIpException(String message) {
        super(message);//调用了Exception一个参数的构造函数
    }

}