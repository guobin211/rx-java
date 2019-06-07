package io.big_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/*
 * FileLocking
 * @Author guobin201314@gmail.com on 2019-06-06 21:11
 */
public class FileLocking {
    private static FileChannel fc;
    private static final int LENGTH = 0x8FFFFFF;

    public static void main(String[] args) throws Exception {
        // 文件映射和加锁
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/guobin/idea/rx-java/src/io/file.txt");
        FileLock fileLock = fileOutputStream.getChannel().tryLock();
        if (fileLock != null) {
            System.out.println("读取文件");
            TimeUnit.MILLISECONDS.sleep(100);
            fileLock.release();
            System.out.println("release locked");
        } else {
            System.out.println("文件正在使用");
        }
        assert fileLock != null;
        fileLock.close();
        // 读写加锁
        fc = new RandomAccessFile("/Users/guobin/idea/rx-java/src/io/lock.txt", "rw").getChannel();
        MappedByteBuffer mappedByteBuffer = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
        for (int i = 0; i < LENGTH / 100; i++) {
            mappedByteBuffer.put((byte) 'a');
        }
        new LockFile(mappedByteBuffer, 0, LENGTH / 200);
        new LockFile(mappedByteBuffer, LENGTH / 150, LENGTH / 100);
    }

    private static class LockFile extends Thread {
        private ByteBuffer buff;
        private int start, end;

        LockFile(ByteBuffer byteBuffer, int start, int end) {
            this.start = start;
            this.end = end;
            byteBuffer.limit(end);
            byteBuffer.position(start);
            buff = byteBuffer.slice();
            start();
        }

        public void run() {
            try {
                FileLock fl = fc.lock(start, end, false);
                while (buff.position() < buff.limit() - 1) {
                    buff.put((byte)(buff.get() + 1));
                }
                fl.release();
                System.out.println("lock 被释放");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
