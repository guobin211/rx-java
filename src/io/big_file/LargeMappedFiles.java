package io.big_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/*
 * LargeMappedFiles
 * @Author guobin201314@gmail.com on 2019-06-06 20:26
 */
public class LargeMappedFiles {
    private static final int length = 0x8ffffff; // 128M
    static void mapWrite() throws Exception {
        // 映射的方式 读写大文件
        MappedByteBuffer out = new RandomAccessFile("/Users/guobin/idea/rx-java/src/io/big.txt", "rw")
                .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);

        for (int i = 0; i < length; i++) {
            out.put((byte)'x');
        }
        System.out.println("写入完成");
    }
    public static void main(String[] args) throws Exception {
        String encoding = System.getProperty("file.encoding");
        FileChannel fileChannel =
                new FileInputStream(new File("/Users/guobin/idea/rx-java/src/io/file.txt")).getChannel();
        // char 缓冲器 可以写入char
        CharBuffer charBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size()).asCharBuffer();
        while (charBuffer.hasRemaining()) {
            System.out.println(charBuffer.get());
        }
        // byte buffer读取
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(Charset.forName(encoding).decode(byteBuffer));
        fileChannel.close();

    }
}
