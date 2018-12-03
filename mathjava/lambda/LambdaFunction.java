package lambda;

/**
 * 声明函数接口
 * 单一职责
 * 默认方法
 */
@FunctionalInterface
interface LambdaFunc {
    int doubleNum(int i);

    // 默认方法
    default int add(int x, int y) {
        return x + y;
    }
}

/**
 * FileName LambdaFunction.java
 *
 * @author guobin201314@gmail.com on 2018/11/29 21:24
 * @version 1.0.0
 */
public class LambdaFunction {

    public static int aDouble = 2;

    public static void main(String[] args) {
        //  箭头函数
        LambdaFunc lambdaFunc1 = i -> i * 2;
        System.out.println(lambdaFunc1);

        //  函数返回值
        int res = lambdaFunc1.doubleNum(aDouble);
        System.out.println(res);

        //  默认方法
        int and = lambdaFunc1.add(2, 5);
        System.out.println(and);
        System.out.println("end========");
    }
}
