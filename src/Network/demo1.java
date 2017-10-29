package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by reyren on 2017/2/3.
 *//*
 * 网络编程：
 *  主要为了解决计算机和计算机之间的数据传输问题（手机）
 *
 * 网络编程与网页编程：
 *      网络编程：不需要基于html页面的就可以达到数据的传输.
 *      网页编程：基于html基础上进行数据的交互的.
 *网络通讯的三要素：
 *      1.IP
 *      2.端口号
 *      3.协议
 *  IP地址：一个由32位的二进制数组成的
 *      分类：一个IP地址=网络号+主机号（子网掩码是255部分的都是网路号）
 *          A类：一个网络号+三个主机号 能配置2^24个机器，政府再用
 *          B类：两个网络号 + 两个主机号 事业单位用的（学校，银行等）
 *          C类：三+二 私人使用
 *
 *  IP类：InetAddress()可以表示IP地址
 *      getLocalHost();获取本机的IP地址
 *      getHostAddress();返回一个ip地址的字符串表示形式
 *      getHostName();//返回计算机的主机名
 *      getByName();给定主机名或IP的情况下确定IP地址对象的
 *  端口号：
 *      端口号的范围是0--65535
 *      0--1023系统紧密绑定一些服务
 *      1024--49151系统绑定了一些松散的服务，也就是说好多系统还是没有用的，
 *      1024---65535我们可以使用
 *  协议：
 *      UDP：
 *          1.将数据和其源和目的封装成数据包发送，不需要建立链接（不管对方在不在，都要发）
 *          2.每个数据包大小限制在64KB中
 *          3.因为无连接，所以不可靠
 *          4.因为不需要链接所以速度快（游戏QQ中都用UDP）
 *          5.部分服务端和客户端的，只分发送端和接收端
 *      TP：
 *          1.面向链接，有特有的通道
 *          2.在链接中传输大数据
 *          3.通过三次握手的链接，可靠协议
 *          4.通信前必须建立链接，效率较低（迅雷等）
 *
 *
 * */
public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*//获取本机的IP地址对象3
        InetAddr ess address = InetAddress.getLocalHost();

        System.out.println(address);
        System.out.println("IP地址" + address.getHostAddress());
        System.out.println(address.getHostName());*/

        //获取别人机器的IP地址
        InetAddress address = InetAddress.getByName("192.168.1.194");
        System.out.println("IP地址" + address.getHostAddress());
        System.out.println("主机名：" + address.getHostName());

        InetAddress[] arr = InetAddress.getAllByName("");//域名或者IP地址

    }
}
