package metadata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 11:41
 */
public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.print(date.toString());
        System.out.println("当前时间为: " + ft.format(date));

        String[] time = {"2018-11-16"};
        parseDate(time);
    }

    /**
     * 时间字符串转时间对象
     *
     * @param args string[]
     */
    private static void parseDate(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("UnParsed using " + ft);
        }
    }
}
