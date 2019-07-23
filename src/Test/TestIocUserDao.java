package Test;

import com.ioc.UserDao;
import com.ioc.UserDao2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

// 测试userDao的实现类
public class TestIocUserDao {

    public static void main(String[] argv){
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.say();

        UserDao2 userDao2 = (UserDao2)applicationContext.getBean("userDao2");// 从工厂中获得实例
        userDao2.say();

    }


}
