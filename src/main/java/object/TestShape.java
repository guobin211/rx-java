package object;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 13:06
 */
public class TestShape {
    public static void main(String[] args) {
        Rect rect = new Rect(5);
        Circle circle = new Circle(5);
        System.out.println(rect.area());
        System.out.println(circle.area());
    }
}
