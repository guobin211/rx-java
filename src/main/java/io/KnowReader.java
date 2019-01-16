package io;

import java.io.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 23:43
 */
public class KnowReader {
    public static void main(String[] args) {
        StringBuilder waitString = new StringBuilder();
        //  读取文件流
        try(Reader reader = new FileReader("src/test.txt")) {
            int n;
            while ((n = reader.read()) != -1) {
                System.out.println((char) n);
                waitString.append((char) n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(waitString);
//        writer();

        readPath("src/main");
    }

    static void writer() {
        try {
            File f = new File("src/test.txt");
            Writer writer = new FileWriter(f);
            writer.write("hello world");
            writer.close();
            System.out.println("写入数据");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readPath(String p) {
        File file = new File(p);
        if (file.isDirectory()) {
            System.out.println("目录：" + p);
            String[] s = file.list();

            assert s != null;
            for (String s1 : s) {
                File f = new File(p + "/" + s1);
                if (f.isDirectory()) {
                    System.out.println(s1 + "：是一个目录");
                } else {
                    System.out.println(s1 + "：是一个文件");
                }
            }
        } else {
            System.out.println(p + " 不是一个目录");
        }
    }
}
