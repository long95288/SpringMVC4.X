package com.aop.learn.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author longquanxiao
 * @date 2019/8/1
 */
public class Invocation {
    /**
     * 反射调用的参数
     */
    private Object[] params;
    /**
     * 被调用的方法对象
     */
    private Method method;
    /**
     * 维护的对象
     */
    private Object target;

    public Invocation(Object target,Method method,Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    /**
     * 反射方法
     * @return 调用原有的方法
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object proceed() throws
            InvocationTargetException,IllegalAccessException {
        // 返回调用的结果
        return method.invoke(target,params);
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
