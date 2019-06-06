package array;

import java.util.Enumeration;
import java.util.Vector;

/*
 * WeekEnum
 * @Author guobin201314@gmail.com on 2019-06-05 13:50
 */
public class WeekEnum {
    public static void main(String[] args) {
        Enumeration<String> weekDays;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("星期天");
        dayNames.add("星期一");
        dayNames.add("星期二");
        dayNames.add("星期三");
        dayNames.add("星期四");
        dayNames.add("星期五");
        dayNames.add("星期六");
        weekDays = dayNames.elements();
        while (weekDays.hasMoreElements()) {
            System.out.println(weekDays.nextElement());
        }

    }
}
