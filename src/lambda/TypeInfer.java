package lambda;

/*
 * TypeInfer
 * @Author guobin201314@gmail.com on 2019-06-07 21:33
 */

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@FunctionalInterface
interface IMath {
    int add(int x, int y);
}

public class TypeInfer {

    public static void main(String[] args) {
        // 匿名访问变量必须加final,java箭头函数传递是传值不是传引用
        final String name = "jdk 11";
        IMath iMath1 = (x, y) -> x + y + 1;
        // 数组里
        IMath[] iMath2 = {(x, y) -> x + y + 2};
        // 强制转换
        Object iMath3 = (IMath) (x, y) -> x + y + 3;
        // 函数类型推断
        IMath iMath4 = createLambda();
        // 线程非阻塞
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.MILLISECONDS.sleep(5000);
                    System.out.println("休眠5秒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        TypeInfer typeInfer = new TypeInfer();
        // 调用
        typeInfer.test(iMath1);
        // 级连表达式
        Function<Integer, Function<Integer, Integer>> doubleFunc = x -> y -> x + y;
        System.out.println("链式调用:" + doubleFunc.apply(2).apply(3));

        int[] nums = {1, 2, 3};
        Function fn = doubleFunc;
        for (int num : nums) {
            if (fn instanceof Function) {
                Object obj = fn.apply(num);
                if (obj instanceof Function) {
                    fn = (Function) obj;
                } else {
                    System.out.println("调用结束:" + obj);
                }
            }
        }
    }

    // 方法
    private void test(IMath iMath) {
        System.out.println("result: " + iMath.add(1, 2));
    }


    private static IMath createLambda() {
        return (x, y) -> x + y + 4;
    }
}
