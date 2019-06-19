/*
 * a_design_create.dynamic_proxy Main
 * @author GuoBin211 on 2019-05-31 23:08
 */
package a.design.create.dynamic_proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

public class Main {
    public static void main(String[] args) {
        System.out.println("动态代理:");
        /*
         * newProxyInstance
         * @pramas getClassLoader class加载器
         * @pramas class[] interface的Class
         * @pramas handle(Object) 代理的函数
         */
        IFood iFood = (IFood) newProxyInstance(
            Main.class.getClassLoader(),
            new Class[] {IFood.class},
            new ProxyHandle(new Beef())
        );
        iFood.eat();

    }
}

