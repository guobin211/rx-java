/*
 * io FileUtil
 * @author GuoBin211 on 2019-06-03 22:12
 */
package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileUtil {
    public static class FS extends ArrayList<String> {
        static String readFile(String fileName) {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringBuilder.toString();
        }

        static void writeFile(String fileName, String text) {
            try {
                // 书写器
                PrintWriter printWriter = new PrintWriter(new File(fileName).getAbsoluteFile());
                printWriter.printf(text);
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        static byte[] readBytes(File file) throws IOException {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
                byte[] data = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(data);
                return data;
            }
        }

        public FS(String fileName, String split) {
            // 拆分字符
            super(Arrays.asList(readFile(fileName).split(split)));
            if (get(0).equals("")) remove(0);
        }

        public FS(String fileName) {
            this(fileName, "\n");
        }

        public void write(String fileName) {
            try {
                PrintWriter printWriter = new PrintWriter(new File(fileName).getAbsoluteFile());
                for (String s: this) {
                    printWriter.print(s);
                }
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String path = "/Users/guobin/idea/rx-java/src/io/";
        // 读取
        String res = FS.readFile(path + "file.txt");
        System.out.println(res);
        // 写入
        FS.writeFile(path + "write.txt", res);
        FS fs = new FS(path+"file.txt", "\n");
        fs.write(path + "test3.txt");
        System.out.println(fs);

        try {
            byte[] bytesFile = FS.readBytes(new File(path + "file.txt"));
            System.out.println(bytesFile.length);
            for (byte b: bytesFile) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

