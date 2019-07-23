package com.ioc;

public class UserServiceImpl implements UserService{
    // 声明了一个userDao的属性
    private UserDao userDao;
    private UserDao2 userDao2;
    private UserDao2 userDao3;
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }
    // setter方法实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setUserDao2(UserDao2 userDao2) {
        this.userDao2 = userDao2;
    }
    public void setUserDao31(UserDao2 userDao3) {
        this.userDao3 = userDao3;
    }

    @Override
    public void say() {
        this.userDao.say();
        this.userDao2.say();
        this.userDao3.say();
        System.out.println("UserServiceImp 中say方法");
    }
}
