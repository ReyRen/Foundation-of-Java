package day13;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created by reyren on 2017/1/31.
 */
/*日期Date类
*  Calendar
*  日期格式化类SimpleDateFormat
*   1.可以把日期转换成指定格式的字符串format()
*   2.可以把一个字符串转换成对应的日期parse()
* */

public class demo3 {
    public static void main(String[] args) {
        Date date = new Date();//获取当前系统时间

        System.out.println();
        Calendar calendar = Calendar.getInstance();//获取当前的系统时间
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH)+1));
        System.out.println("时：" + (calendar.get(Calendar.HOUR_OF_DAY)));
        System.out.println("分：" + (calendar.get(Calendar.MINUTE)));
        System.out.println("秒：" + (calendar.get(Calendar.SECOND)));

        //显示当前系统时间是：2017年1月31日 XX时XX分XX秒

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//使用默认的格式创建了一个日期格式对象

        String time =  dateFormat.format(date);
        System.out.println(time);

        String birthday = "2000年12月26日 11:22:22";
        try {
            Date date1 = dateFormat.parse(birthday);//指定的字符串必须要与SimpleDateFormat模式要一致
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
