package metadata;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 10:26
 */
public class Variable {
    public static void main(String[] args) {
        Variable testVariable = new Variable();
        testVariable.buildAge();
    }

    public void buildAge() {
        int age = 15;
        age = age + 12;
        System.out.print(age);
    }
}
