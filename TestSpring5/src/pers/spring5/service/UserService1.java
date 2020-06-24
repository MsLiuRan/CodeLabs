package pers.spring5.service;

import pers.spring5.dao.UserDao;
import pers.spring5.factory.UserFactory;

/**
 * @ClassName UserService1
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/24 14:33
 * @Version 1.0
 */
public class UserService1 {
    public void execute () {
        UserDao dao = UserFactory.getDao();
        dao.add();
    }
}
