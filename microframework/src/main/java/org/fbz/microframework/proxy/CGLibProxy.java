package org.fbz.microframework.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor{
    private static CGLibProxy instance = new CGLibProxy();
    
    private CGLibProxy() {}
    
    public static CGLibProxy getInstance() {
        return instance;
    }
    
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = proxy.invoke(obj, args);
        return result;
    }

}
