package dynomic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Yang on 2016/7/20.
 */
public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object subject) {
        this.subject = subject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ----------\n rent house");
        System.out.println("Method " +method);
        method.invoke(subject,args);
        System.out.println("after --------");
        return null;
    }
}
