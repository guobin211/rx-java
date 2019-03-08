package io;

import java.io.*;
import java.nio.charset.StandardCharsets;


/**
 * @author GuoBin201314@gmail.com on 2018/11/17 19:53
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/main/java/stream/test.json");
        String path = file.getPath();
        String aPath = file.getAbsolutePath();
        String cPath = "";
        try {
            cPath = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file);
        System.out.println(path);
        System.out.println(aPath);
        System.out.println(cPath);
        System.out.println(file.canRead());
        readLocal();
        readAsString();
    }

    /**
     * reader 对象
     */
    private static void readLocal() {
        String path = "src/main/java/stream/test.json";
        try (InputStream input = new FileInputStream(path)) {
            System.out.println("read" + path + "...");
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * java 读取json文件
     */
    private static void readAsString() {
        String path = "src/main/java/stream/test.json";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                try {
                    if (!inputStreamReader.ready()) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    stringBuilder.append((char) inputStreamReader.read());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
