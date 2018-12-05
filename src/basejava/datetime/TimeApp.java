package datetime;

import java.time.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/18 10:30
 */
public class TimeApp {
    public static void main(String[] args) {
        showTime();
        zonedDate();
    }

    static void showTime() {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        //  5天后
        LocalDate nextDay = d.plusDays(5);
        System.out.println(nextDay);
        //  本月第一天
        LocalDate first = d.withDayOfMonth(1);
        //  计算时间差
        LocalDate ld1 = LocalDate.of(2016,11,20);
        LocalDate ld2 = LocalDate.of(2018,11,10);
        Period p = ld1.until(ld2);
        System.out.println(p);
    }

    /**
     * 时区转换
     */
    static void zonedDate() {
        ZonedDateTime z = ZonedDateTime.now();
        ZonedDateTime usa = z.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("纽约时间：" + usa);
    }
}
