package computed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * @author GuoBin201314@gmail.com on 2018/11/18 10:52
 */
public class RegMatch {
    public static void main(String[] args) {
        System.out.println(matchPhone("Da5"));
        System.out.println(matchPhone("a5"));
        System.out.println(matchPhone("a5d"));
        System.out.println(matchString("13326985467"));
    }

    static boolean matchPhone(String s) {
        return s.matches("^[a-z][5]$");
    }
    static int matchString(String s) {
        Pattern p = Pattern.compile("^\\d+?(0*)$");
        Matcher m = p.matcher(s);
        System.out.println(m);
        if (m.matches()) {
            String zeroStr = m.group(1);
            System.out.println(zeroStr);
            return zeroStr.length();
        }
        throw new IllegalArgumentException("not a number");
    }
}
