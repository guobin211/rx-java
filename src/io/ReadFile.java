package io;

import java.io.*;
import java.util.Arrays;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 19:53
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        String path = file.getPath();
        String aPath = file.getAbsolutePath();
        String cPath = "";
        try {
            cPath = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(file);
//        System.out.println(path);
//        System.out.println(aPath);
//        System.out.println(cPath);
//        System.out.println(file.canRead());
//        readFile();
        readLocal();
    }

    static void readFile() {
        try (InputStream inputStream = new FileInputStream("src/test.txt")) {
            int n;
            while ((n=inputStream.read()) != -1){
                System.out.println(n + "bytes read");
            }
//            byte[] bt = inputStream.readAllBytes();
//            String st = Arrays.toString(bt);
//            System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * reader 对象
     */
    static void readLocal() {
        String path = "src/test.txt";
        try (InputStream input = new FileInputStream(path)) {
            System.out.println("read" + path + "...");
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readAsObject() {

    }
}
