package io.big_file;

import java.io.*;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

/**
 * GZipCompress
 * @author guobin201314@gmail.com on 2019-06-06 21:41
 */
public class GZipCompress {
    public static void main(String[] args) throws Exception {
        String file = "/Users/guobin/idea/rx-java/src/io/socket.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(
                new FileOutputStream("/Users/guobin/idea/rx-java/src/io/big_file/socket.gz")
        ));
        System.out.println("开始压缩文件");
        int c;
        while ((c = bufferedReader.read()) != -1) {
            bufferedOutputStream.write(c);
        }
        bufferedReader.close();
        bufferedOutputStream.close();
        System.out.println("压缩完成");
    }

    static void zipFile(String path, String out) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(out);
        // 校验功能的输出流
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(fileOutputStream, new Adler32());
        // zip可以进行多文件压缩
        ZipOutputStream zipOutputStream = new ZipOutputStream(checkedOutputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream);
        zipOutputStream.setComment("Java Zip File .gz");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int c;
        while ((c = bufferedReader.read()) != -1) {
            bufferedOutputStream.write(c);
        }
        bufferedReader.close();
        // fileOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
}
