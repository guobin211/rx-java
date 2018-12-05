package metadata;

/**
 * 修饰符
 *
 * @author GuoBin201314@gmail.com on 2018/11/16 10:37
 */
public class Modifier {
    private boolean isMax;
    protected static final int MAX_HEIGHT = 128;
    static final double WEEK = 9.5;

    /**
     * 主方法
     *
     * @param args string[]
     */
    public static void main(String[] args) {
        System.out.print(MAX_HEIGHT + "\n");
        System.out.print(WEEK);

        Modifier mod = new Modifier();

        System.out.print(mod.isMax);
    }
}
