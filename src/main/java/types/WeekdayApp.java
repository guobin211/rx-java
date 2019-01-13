package types;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 14:53
 */
public class WeekdayApp {
    public static void main(String[] args) {
        for (Weekday day: Weekday.values()) {
            System.out.println(day.name());
        }
        Weekday mon = Weekday.MON;
        System.out.println(mon);
        System.out.println(mon.toChinese());
    }
}
