package array;

/**
 * FileName Students.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 11:07
 * @version 1.0.0
 */
public class Student {
    private String name;
    private int score;

    public Student(String inputName, int inputScore) {
        name = inputName;
        score = inputScore;
    }

    @Override
    public String toString() {
        return String.format("Students (name: %s, score: %d)",name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("jack", 55));
        arr.addLast(new Student("tom", 48));
        arr.addLast(new Student("mary", 63));

        System.out.println(arr);
    }
}
