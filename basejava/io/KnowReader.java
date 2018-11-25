package io;

import java.io.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 23:43
 */
public class KnowReader {
    public static void main(String[] args) {
        //  读取文件流
//        try(Reader reader = new FileReader("src/test.txt")) {
//            int n;
//            while ((n = reader.read()) != -1) {
//                System.out.println((char) n);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        writer();
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
}
