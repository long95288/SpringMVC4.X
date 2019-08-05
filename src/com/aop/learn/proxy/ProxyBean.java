package com.aop.learn.proxy;

import com.aop.learn.intercept.Interceptor;
import com.aop.learn.invoke.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author longquanxiao
 * @date 2019/8/1
 */
public class ProxyBean implements InvocationHandler {
    /**
     * 被代理的目标
     */
    private Object target = null;

    /**
     * 拦截器
     */
    private Interceptor interceptor = null;

    public static Object getProxyBean(Object target,Interceptor interceptor){
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;
        // 生成代理对象
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                proxyBean);
        return proxy;
    }
    /**
     * 绑定代理的对象
     * @param proxy 代理对象
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean exceptionFlag = false;
        // 调用的对象
        Invocation invocation = new Invocation(target,method,args);
        Object retObj = null;
        try {
            if(this.interceptor.before()){
                retObj = this.interceptor.around(invocation);
            }else{
                // 调用被代理的对象的方法
                retObj = method.invoke(target,args);
            }
        }catch (Exception e){
           exceptionFlag = true;
        }
        this.interceptor.after();
        if(exceptionFlag){
            this.interceptor.afterThrowing();
        }else {
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }
}
