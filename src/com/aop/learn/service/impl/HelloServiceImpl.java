package com.aop.learn.service.impl;

import com.aop.learn.service.HelloService;

/**
 * @author longquanxiao
 * @date 2019/8/1
 */
public class HelloServiceImpl implements HelloService {
    /**
     * if name not null say hello+name
     *
     * @param name
     */
    @Override
    public void sayHello(String name) {
        if(name == null || "".equals(name)){
            throw new RuntimeException("参数为空");
        }
        System.out.println("hello" + name);
    }
}
