package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GuoBin201314@gmail.com on 2018/11/18 10:14
 */
public class MainApp {
    public static void main(String[] args) {
        int n = 123400;
        System.out.println(n);
        showDate();
    }
    private static void showDate() {
        Date date = new Date();
        //  Sun Nov 18 10:29:09 CST 2018
        System.out.println(date.toString());
        long t = date.getTime();
        //  1542508149548
        System.out.println(t);
        String s = "2018-11-18 10-28-77";
        String sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-SS").format(date);
        try {
            Date sd = new SimpleDateFormat("yyyy-MM-dd HH-mm-SS").parse(s);
            System.out.println(sd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf);
    }
}
