import string.StringUtils;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        // 5 + 7 + 7 + 5
        int s = i++ + ++i + i-- + --i;
        System.out.println(s);
        StringUtils.getName();
    }
}
