package mapset;

import java.util.Objects;

/**
 * Student
 * @Author guobin201314@gmail.com on 2019-06-19 11:55
 */
public class Student implements Comparable {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(student.getName(), getName()) && student.getAge() == getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        // 先比较年龄,在比较name
        if (getAge() > student.getAge()) {
            return 1;
        }
        if (getAge() < student.getAge()) {
            return -1;
        }
        return getName().compareTo(student.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
