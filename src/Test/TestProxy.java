package Test;

import com.aop.learn.intercept.MyInterceptor;
import com.aop.learn.proxy.ProxyBean;
import com.aop.learn.service.HelloService;
import com.aop.learn.service.impl.HelloServiceImpl;

/**
 * @author longquanxiao
 * @date 2019/8/1
 */
public class TestProxy {
    public static void main(String[] args) {
        // 被代理的对象
        HelloService helloService = new HelloServiceImpl();
        // 获得代理，并且在代理中织入拦截器
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(
                helloService,new MyInterceptor()
        );
        proxy.sayHello("张三");
        System.out.println("name null .........");
        proxy.sayHello(null);
    }
}
