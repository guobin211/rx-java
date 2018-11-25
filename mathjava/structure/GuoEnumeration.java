package structure;

import java.util.Vector;
import java.util.Enumeration;

/**
 * 枚举
 * @author GuoBin201314@gmail.com on 2018/11/16 14:09
 */
public class GuoEnumeration {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
