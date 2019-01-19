package dip;

/**
 * dip   Main
 * 依赖倒置原则  依赖抽象接口，不依赖实体类
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("start...");
        new Mother().read(new Book());
        new Mother().read(new AnotherBook());
    }
}
