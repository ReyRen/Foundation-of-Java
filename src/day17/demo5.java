package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.TreeMap;

/**
 * Created by reyren on 2017/3/4.
 */
/*需求:定义一个TreeMap，键存的是书对象，值存的是字符串，根据书的出版如期进行排序

*
* */

public class demo5 {
    public static void main(String[] args) {
        TreeMap<Book,String> map = new TreeMap<Book,String>();
        map.put(new Book("红楼梦","1990-11-03"),"001");
        map.put(new Book("西游记","1993-08-13"),"002");
        map.put(new Book("水浒传","1989-04-03"),"003");
        map.put(new Book("三国演义","1997-10-04"),"004");
        System.out.println(map);

    }
}
class Book implements Comparable<Book>{
    String name;
    String date;

    public Book(String name, String date) {
        this.name = name;
        this.date = date;
    }

   /* @Override利用了字符串的compareTo进行排序
    public int compareTo(Book o) {
        return this.date.compareTo(o.date);//这个CompareTo分方法是比较的自然序数型的，所以这个和override的方法是不一样的
    }*/
   //先把字符串的日期转成Date对象，然后再使用Date对象进行比较


    @Override
    public int compareTo(Book o) {
        //日期格式化类
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //使用日期格式化类把字符串转换成date对象
        Date date = null;
        Date date2 = null;
        try {
            date = dateFormat.parse(this.date);
            date2 = dateFormat.parse(o.date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.compareTo(date2);
    }

    @Override
    public String toString() {
        return "【书名：" + this.name + " 出版如期:" + this.date + "]";
    }
}