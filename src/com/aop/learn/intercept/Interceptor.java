package com.aop.learn.intercept;


import com.aop.learn.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * 拦截器接口
 * @author longquanxiao
 * @date 2019/8/1
 */
public interface Interceptor {
    /**
     * 事前方法
     * @return true or false
     */
    boolean before();

    /**
     * 事后方法
     */
    void after();

    /**
     * 取代原有的事件方法
     * @param invocation 回调参数，通过proceed方法回调原有事件
     * @return 原有事件返回对象
     * @throws InvocationTargetException,IllegalAccessException 可能会抛出的异常
     */
    Object around(Invocation invocation) throws
            IllegalAccessException,InvocationTargetException;

    /**
     * 是否返回方法，事件没有发生异常的时候执行
     */
    void afterReturning();

    /**
     * 事后异常方法
     */
    void afterThrowing();
    /**
     * 是否使用around方法取代原有方法
     * @return true or false
     */
    boolean useAround();
}
