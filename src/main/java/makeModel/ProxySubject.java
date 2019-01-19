package makeModel;

interface Meeting {
    void call();
}

class Boos implements Meeting {
    @Override
    public void call() {
        String secret = "password";
        System.out.println("Boos call Meeting with " + secret);
    }
}

/**
 * 秘书代理Boos
 */
class Secretary implements Meeting {
    Meeting meeting = new Boos();
    @Override
    public void call() {
        System.out.println("Secretary call Meeting");
        meeting.call();
    }
}

/**
 * makeModel   ProxySubject
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class ProxySubject {
    public static void main(String[] args) {
        System.out.println("代理模式");

        Meeting meeting = new Secretary();
        meeting.call();
    }
}
