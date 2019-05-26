package Test;

import com.Ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestIocUserService {
    public static void main(String[] argv){
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.say();
    }
}
