package a.oop.dip;

/**
 * Main
 *  依赖导致原则，面向接口变成，依赖抽象不依赖实体
 *  接口依赖于接口，不依赖于具体的实现
 * @author GuoBin211 on 2019-05-30 22:41
 */
public class Main {
    public static void main(String[] args) {
        Women women = new Women();
        women.read(new Book());
        women.read(new NewsPaper());
    }
}

