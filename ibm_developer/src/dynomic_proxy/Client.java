package dynomic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Yang on 2016/7/20.
 */

public class Client {
    public static void main(String[] args) {

        Subject realSubject = new RealSubject();
        InvocationHandler invocationHandler = new DynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),invocationHandler);
        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.hello("proxy");

    }
}
