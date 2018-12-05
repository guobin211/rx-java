package object;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 12:25
 */
public class Person {
    protected String name;
    protected int age;
    public Person(int age) {
        this.age = age;
    }
    public void getAge() {
        System.out.println(this.age);
    }
}
