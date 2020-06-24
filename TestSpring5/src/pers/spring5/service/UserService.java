package pers.spring5.service;

import pers.spring5.dao.UserDao;

/**
 * @ClassName UserService
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/23 18:01
 * @Version 1.0
 */
public class UserService {
    public void execute () {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
