package com.ioc;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("UserDao 的 say 语句");
    }
}
