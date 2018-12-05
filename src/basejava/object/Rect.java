package object;

/**
 * 正方形子类继承shape
 * @author GuoBin201314@gmail.com on 2018/11/17 13:01
 */
public class Rect extends BaseShape {
    private int num;
    public Rect(int i) {
        this.num = i;
    }
    @Override
    public final double area() {
        return num*num;
    }
}
