package pers.spring5.service;

import pers.spring5.dao.UserDao;
import pers.spring5.dao.UserDaoImpl;

import javax.sound.midi.Soundbank;

/**
 * @ClassName UserService
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/23 18:01
 * @Version 1.0
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add () {
        System.out.println("service add.....");
        userDao.update();
        //原始方式:创建UserDao对象
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }
}
