package stream;

import java.io.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 13:32
 */
public class ReadFile {
    public static void main(String[] args) {
        readFromSystem();
        readLocalFile();
    }

    private static void readFromSystem() {
        char c = 0;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        } while (c != 'q');
    }

    /**
     * local readFile
     */
    private static void readLocalFile() {
        File f = new File("/Users/macbook/Documents/GitHub/rx-java/src/stream/test.json");
        try {
            InputStream out = new FileInputStream(f);
            System.out.print(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
