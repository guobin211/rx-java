/*
 * string RegRexUtil
 * @author GuoBin211 on 2019-06-01 12:48
 */
package string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegRexUtil {
    private boolean match;

    public static void main(String[] args) {
        System.out.println("正则表达式");

        String name = "jack jones";
        // ^ 开始 $ 结束 ? 最多一次  * 任意次数  + 一次或者多次  {n, m} n次到m-1次
        boolean match = name.matches("^[a-z]|[A-Z]*");
        System.out.println(match);
        // reg
        String reg = "abc";
        // 匹配器
        Pattern pattern = Pattern.compile(reg);
        // 匹配结果
        Matcher matcher = pattern.matcher("amdabc1993abc");
        List<String> list = new ArrayList<>();
        // 组合查找的结果
        while (matcher.find()) {
            System.out.println(matcher.group());
            list.add(matcher.group());
        }
        System.out.println(list.toString());
        // 读取文件内容
        StringBuilder stringBuilder = new StringBuilder();
        String path = "/Users/guobin/idea/rx-java/src/string/";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path + "index.html")));
            String s;
            try {
                bufferedReader.readLine();
                while (bufferedReader.readLine() != null) {
                    s = bufferedReader.readLine();
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }
}

