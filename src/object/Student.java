package object;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 12:26
 */
public class Student extends Person{
    public int score;
    public static void main(String[] args) {
        Person p = new Person(22);
        p.getAge();
        Student s = new Student(15);
        s.getAge();
        display(s.score);
//        System.out.println(s instanceof Person);
    }

    /**
     * 子类的构造方法必须调用父类的构造方法
     * 使用 super()
     */
    public Student(int age) {
        super(age);
        this.score = 88;
    }
    public static void display(int i) {
        System.out.println(i);
    }
}
