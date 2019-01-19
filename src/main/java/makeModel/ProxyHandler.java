package makeModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * makeModel   ProxyHandler
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
class ProxyHandler implements InvocationHandler {

    Object realSubject;

    public ProxyHandler(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("call proxy handler ...");
        Object res = method.invoke(realSubject, args);
        System.out.println("我们代理了 ..." + realSubject.getClass().getSimpleName());
        return res;
    }
}