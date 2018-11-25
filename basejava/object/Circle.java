package object;

/**
 * 圆形子类继承shape
 * @author GuoBin201314@gmail.com on 2018/11/17 13:02
 */
public class Circle extends BaseShape {
    private int num;
    final double PI = 3.141592653;
    public Circle(int i) {
        this.num = i/2;
    }

    @Override
    public final double area() {
        return PI*num*num;
    }
}
