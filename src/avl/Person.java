package avl;

/**
 * Person class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-29
 */
public class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.name = name;
        this.age= age;
    }

    @Override
    public int hashCode() {
        int B = 31;
        int hash = 0;
        hash = hash * B + age;
        hash = hash * B + name.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.hashCode() == p.hashCode();
    }

    @Override
    public String toString() {
        return "{name:\""+ name +"\", age: "+ age +"}";
    }
}
