package collection;

/**
 * SelfPerson
 *
 * @author guobin201314@gmail.com on 2019-01-24
 * @version 1.0.0 by JDK 1.8
 */
public class SelfPerson {

    public String name;
    public int age;

    public SelfPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SelfPerson [" + this.name + " = " + this.age + "]";
    }

    /**
     * @param obj SelfPerson
     * @return bool
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SelfPerson selfPerson = (SelfPerson)obj;
        if (age != selfPerson.age) {
            return false;
        }
        if (name == null) {
            return selfPerson.name == null;
        } else return name.equals(selfPerson.name);
    }

    /**
     * 只有hashcode 一致才会调用equals方法
     * 1, 31是一个质数
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int res = 1;
        res = prime * res + age;
        res = prime * res + ((name ==null) ? 0: name.hashCode());
        return res;
    }
}
