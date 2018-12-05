package object;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 12:14
 */
public class TestObject {
    public static void main(String[] args) {
        Object obj = new Object("tom", 22);
        String name = obj.getName();
        System.out.println(name);
        obj.setName("jack");
        name = obj.getName();
        System.out.println(name);
        System.out.println(obj.age);
    }
}
