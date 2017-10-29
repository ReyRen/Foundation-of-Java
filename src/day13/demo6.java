package day13;

/**
 * Created by reyren on 2017/2/1.
 */
/*
* 模拟qq视频与聊天
*
* */
public class demo6 {
    public static void main(String[] args) {
        Talk talk = new Talk();
        talk.start();
        Video video = new Video();
        video.start();

    }
}
class Video extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("视频视频...");
        }
    }
}
class Talk extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("hi，你好，开视频啊。。。");
        }
    }
}
