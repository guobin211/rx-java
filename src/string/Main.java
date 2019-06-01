package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入年份：");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        int year = Integer.parseInt(s);

        if (year < 1) {
            System.out.println("输入的年份不能小于1！");
            return;
        }
        int week = firstDayOf(year);

        System.out.println(year);
        System.out.println(week);
    }

    /**
     * 计算第一天是星期几
     *
     * @param year
     * @return [0,1,2,3,4,5,6]
     */
    private static int firstDayOf(int year) {
        int res;
        res = year * 365;
        for (int i = 0; i < year; i++) {
            if (isLeapYear(i)) {
                res += 1;
            }
        }
        return res % 7;
    }

    /**
     * 判断闰年
     * @param i
     * @return
     */
    private static boolean isLeapYear(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    private static String getString(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append("第").append(i).append("个\n");
        }
        return res.toString();
    }
}
