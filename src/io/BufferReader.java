package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * BufferReader
 * @Author guobin201314@gmail.com on
 */
public class BufferReader {
    private static final int BSIZE = 1024;
    private static final String PATH = "/Users/guobin/idea/rx-java/src/io/";
    public static void main(String[] args) throws Exception {
        // 文件通道 输出流
        FileChannel fileChannel = new FileOutputStream(PATH + "file.txt").getChannel();
        fileChannel.write(ByteBuffer.wrap("先增加的 text".getBytes()));
        fileChannel.close();

        // 读写通道
        fileChannel = new RandomAccessFile(PATH + "file.txt", "rw").getChannel();
        // 跳转到文件末尾
        fileChannel.position(fileChannel.size());
        fileChannel.write(ByteBuffer.wrap("最后增加的 text".getBytes()));
        fileChannel.close();

        fileChannel = new FileInputStream(PATH + "file.txt").getChannel();
        // 字节缓冲器
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fileChannel.read(byteBuffer);
        // 反转
        byteBuffer.flip();
        // 读出来
        while (byteBuffer.hasRemaining()) {
            System.out.print((char)byteBuffer.get());
        }

    }
}
