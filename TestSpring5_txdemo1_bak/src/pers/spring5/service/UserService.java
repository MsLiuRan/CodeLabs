package pers.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pers.spring5.dao.UserDao;

/**
 * @ClassName UserService
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/7/1 22:24
 * @Version 1.0
 */
@Service
@Transactional(timeout = -1,propagation = Propagation.REQUIRED) //(可以加在service类上面也可以加在service类里面的方法上面)
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;
    //转账的方法
    public void accountMoney() {
        //lucy少100
        userDao.reduceMoney();
        //模拟异常
        int i = 10/0;
        //mary多100
        userDao.addMoney();

//        try {
//            //第一步 开启事务
//
//            //第二步 进行业务操作
//            //lucy少100
//            userDao.reduceMoney();
//            //模拟异常
//            int i = 10/0;
//            //mary多100
//            userDao.addMoney();
//            //第三步 没有发生异常，提交事务
//        } catch (Exception e) {
//            //第四步 事务回滚
//        }

    }
}
