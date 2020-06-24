package pers.spring5.factory;

import pers.spring5.dao.UserDao;

/**
 * @ClassName UserFactory
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/23 18:03
 * @Version 1.0
 */
public class UserFactory {
    public static UserDao getDao() {
        return new UserDao();
    }
}
