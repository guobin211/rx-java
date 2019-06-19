/*
 * a_design_create.dynamic_proxy ProxyHandle
 * @author GuoBin211 on 2019-05-31 23:14
 */
package a.design.create.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模式handle
 */
public class ProxyHandle implements InvocationHandler {
    private Object realSubject;
    ProxyHandle(Object subject) {
        this.realSubject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用 proxy handle");
        Object res = method.invoke(realSubject, args);
        System.out.println("代理了" + realSubject.getClass().getSimpleName());
        return res;
    }
}

