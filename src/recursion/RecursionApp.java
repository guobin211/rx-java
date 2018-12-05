package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version  1.0  RecursionApp
 * @author  guobin201314@gmail.com
 * @date  2018/11/20 23:25
 */
public class RecursionApp {
    public static void main(String[] args) {
        try {
            int thnNumber = getInt();
            int theAnswer = triangle(thnNumber);
            System.out.println(theAnswer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 输入数字
     * @return string
     * @throws IOException io异常
     */
    public static String getString() throws IOException {
        System.out.println("请输入数字：");
        String res;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        res = bufferedReader.readLine();
        return res;
    }

    /**
     * 转数字
     * @return int
     * @throws IOException io异常
     */
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    /**
     * 递归求和 自己调用函数
     * @param n 三角求和 （n*n+n）/ 2
     * @return 和
     */
    private static int triangle(int n) {
        //  基值 终止条件
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n-1));
        }
    }
}
