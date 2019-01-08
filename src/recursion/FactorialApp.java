package recursion;

import java.util.Date;

/**
 * @version 1.0  FactorialApp 计算阶乘
 * @author guobin201314@gmail.com
 * 2018/11/20 23:40
 */
public class FactorialApp {
    public String selfName;
    private long createdTime;
    public static void main(String[] args) {
        FactorialApp factorialApp = new FactorialApp("admin");
        System.out.print(factorialApp.createdTime);
        System.out.print(factorialApp.selfName);
        factorialApp.createdTime = 1546844177;
        System.out.print(factorialApp.createdTime);
    }

    public FactorialApp(String name) {
        this.selfName = name;
        this.createdTime = new Date().getTime();
    }
}
