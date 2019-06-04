package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * CopyFile
 * @Author guobin201314@gmail.com on
 */
public class CopyFile {
    private static void copyTo(String from, String to) {
        try {
            FileChannel fileChannelIn = new FileInputStream(from).getChannel();
            FileChannel fileChannelOut = new FileOutputStream(to).getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            // 读取和写入
            while (fileChannelIn.read(byteBuffer) != -1) {
                byteBuffer.flip();
                fileChannelOut.write(byteBuffer);
                byteBuffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void transform(String from, String to) {
        try {
            FileChannel fileChannelIn = new FileInputStream(from).getChannel();
            FileChannel fileChannelOut = new FileOutputStream(to).getChannel();
            // 拷贝文件到目标文件
            fileChannelIn.transferTo(0, fileChannelIn.size(), fileChannelOut);
            // 从源文件拷贝
            // fileChannelOut.transferFrom(fileChannelIn, 0, fileChannelIn.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String path = "/Users/guobin/idea/rx-java/src/io/";
        System.out.println("复制文件");
        copyTo(path + "file.txt", path + "file2.txt");
    }
}
