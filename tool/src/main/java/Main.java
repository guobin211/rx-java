import model.Person;

/**
 * PACKAGE_NAME
 * tool
 *
 * @author guobin211
 * @version 0.0.1
 * @date 2019/11/13 at 9:33 下午
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gradle");
        Person person = new Person("jack", 22);
        System.out.println(person);
    }
}
