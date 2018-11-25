package object;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 12:12
 */
public class Object {
    private String name;
    public int age;

    /**
     * 构造方法
     * @param name name
     */
    public Object(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * getter
     * @return name
     */
    public String getName() {
        return this.name + this.age;
    }

    /**
     * setter
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
