/*
 * io FileClient
 * @author GuoBin211 on 2019-06-02 22:22
 */
package io;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FileClient {
    private static final String PATH = "/Users/guobin/idea/rx-java/src";

    /**
     * 文件过滤器
     */
    static class DirFilter implements FilenameFilter {
        private Pattern pattern;

        DirFilter(String reg) {
            pattern = Pattern.compile(reg);
        }

        @Override
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }

    static void printFileMethods() {
        Method[] methods = File.class.getDeclaredMethods();
        for (Method s: methods) {
            System.out.println(s);
        }
    }

    private static void readFile(String name) {
        try {
//            StringReader stringReader = new StringReader(name);
//            int c;
//            StringBuilder stringBuilder = new StringBuilder();
//            while ((c = stringReader.read()) !=-1) {
//                stringBuilder.append((char) c);
//            }
//            System.out.println(stringBuilder.toString());
            BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
            String s;
            StringBuilder stringBuilder = new StringBuilder();
            try {
                // 逐行读取
                while ((s = bufferedReader.readLine())!= null) {
                    stringBuilder.append(s).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String name, String text) {
        File file = new File(name);
        if (file.exists() && file.canWrite()) {
            try {
                // 打开
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                // 写入
                outputStreamWriter.append("开始输入:\n");
                outputStreamWriter.append(text);
                outputStreamWriter.append("输入结束");

                // 关闭
                outputStreamWriter.close();
                outputStreamWriter.close();
                fileOutputStream.close();
                System.out.println("写入文件结束.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("can not write");
            try {
              boolean success = file.createNewFile();
              System.out.println("是否创建成功？" + success);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        readFile(PATH + "/io/file.txt");

        writeFile(PATH + "/io/test.txt", "1：测试文本数据。");

        File file = new File("./src");
        String[] list;
        if (args.length == 0) {
            System.out.println("no args");
            // 匹配.java文件
            list = file.list(new DirFilter("\\S+[.java]"));
        } else {
            System.out.println("input args");
            list = file.list(new DirFilter("*.java"));
            assert list != null;
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        }
        assert list != null;
        for (String f: list) {
            System.out.println(f);
        }
    }
}

