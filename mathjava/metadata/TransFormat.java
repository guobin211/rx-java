package metadata;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 10:22
 */
public class TransFormat {
    public static void main(String[] args) {
        //定义一个char类型
        char c = 'a';
        //char自动类型转换为int
        int i1 = c;
        System.out.println("char自动类型转换为int后的值等于" + i1);
        //定义一个char类型
        char c2 = 'A';
        //char 类型和 int 类型计算
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}
