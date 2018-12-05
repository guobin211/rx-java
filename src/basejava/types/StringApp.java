package types;

import java.util.Arrays;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 13:45
 */
public class StringApp {
    public static void main(String[] args) {
        String s = "Hello World JAVA '\\n'";
        display(s);
        String b = s.trim();
        display(b);
        String res = s.replace("H", "h");
        display(res);
        char[] ca = s.toCharArray();
        display(ca);
        String reg = "[^a-zA-z]]";
        String str = s.replaceAll(reg, "");
        display(str);
        str = str.replaceAll("\\\\", "");
        display(str);
        build();
    }

    private static void display(String s) {
        System.out.println(s);
    }
    private static void display(char[] c) {
        System.out.println(Arrays.toString(c));
    }
    private static void build() {
        StringBuilder sb = new StringBuilder(1024);
        String s = "Hello" + "World";
        sb.append(s).append(15).append("jack");
        System.out.println(sb);
    }
}
