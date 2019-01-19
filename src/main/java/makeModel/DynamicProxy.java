package makeModel;

import java.lang.reflect.Proxy;

interface ISeller {
    void buy();
}

interface IKfcSeller {
    void eat();
}

class Kfc implements  IKfcSeller{

    @Override
    public void eat() {
        System.out.println("Kfc eat");
    }
}

class Market implements ISeller {

    @Override
    public void buy() {
        System.out.println("Market buy");
    }
}

/**
 * makeModel   DynamicProxy
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class DynamicProxy {
    public static void main(String[] args) {
        System.out.println("动态代理");
        // 代理 iKfcSeller Kfc
        IKfcSeller iKfcSeller = (IKfcSeller) Proxy.newProxyInstance(
                DynamicProxy.class.getClassLoader(),
                new Class[] {IKfcSeller.class},
                new ProxyHandler(
                    new Kfc()
                )
        );

        iKfcSeller.eat();
        // 代理 ISeller Market
        ISeller iSeller = (ISeller) Proxy.newProxyInstance(
            DynamicProxy.class.getClassLoader(),
            new Class[] {ISeller.class},
            new ProxyHandler(
                new Market()
            )
        );
        iSeller.buy();
    }
}
