package com.aop.learn.intercept;


import com.aop.learn.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @author longquanxiao
 * @date 2019/8/1
 */
public class MyInterceptor implements Interceptor{
    /**
     * 事前方法
     *
     * @return true or false
     */
    @Override
    public boolean before() {
        System.out.println("before .......");
        return true;
    }

    /**
     * 事后方法
     */
    @Override
    public void after() {
        System.out.println("after .....");
    }

    /**
     * 取代原有的事件方法
     *
     * @param invocation 回调参数，通过proceed方法回调原有事件
     * @return 原有事件返回对象
     * @throws InvocationTargetException
     */
    @Override
    public Object around(Invocation invocation) throws InvocationTargetException,IllegalAccessException {
        System.out.println("around before ....");
        Object obj = invocation.proceed();
        System.out.println("around after ...");
        return obj;
    }

    /**
     * 是否返回方法，事件没有发生异常的时候执行
     */
    @Override
    public void afterReturning() {
        System.out.println("afterReturning ....");
    }

    /**
     * 事后异常方法
     */
    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }

    /**
     * 是否使用around方法取代原有方法
     *
     * @return true or false
     */
    @Override
    public boolean useAround() {
        return true;
    }
}
