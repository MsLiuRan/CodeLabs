package pers.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/26 11:41
 * @Version 1.0
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl add...");
    }
}
