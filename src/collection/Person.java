package collection;

import java.util.Objects;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 18:21
 */
public class Person {
    public String name;
    public Integer age;

    /**
     * 构造函数
     * @param name  name
     * @param age  age
     */
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写hashcode
     * @return hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    /**
     * 重写equals
     * @param obj object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj ==this) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person)obj;
            return Objects.equals(this.name, p.name) && this.age.equals(p.age);
        }
        return false;
    }
}
