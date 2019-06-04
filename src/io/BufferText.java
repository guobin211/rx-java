package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/*
 * BufferText
 * @Author guobin201314@gmail.com on 2019-06-04
 */
public class BufferText {
    public static void main(String[] args) {
        String encoding = System.getProperty("file.encoding");
        try {
            FileChannel fc = new FileInputStream("/Users/guobin/idea/rx-java/src/io/file.txt").getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            // 读到缓冲区
            fc.read(byteBuffer);
            byteBuffer.flip();
            // 输出char
            System.out.println(byteBuffer.asCharBuffer());
            // 重新编码
            byteBuffer.rewind();
            System.out.println("文件格式：" + encoding);
            System.out.println(Charset.forName(encoding).decode(byteBuffer));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
