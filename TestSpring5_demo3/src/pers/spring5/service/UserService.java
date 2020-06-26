package pers.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pers.spring5.dao.UserDao;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/26 11:13
 * @Version 1.0
 */
//在注解里面value属性值可以省略不写
//默认值是类名，首字母小写
//UserService -- userService
//@Component(value = "userService")//<bean id="userService" class=".."/>
@Service
public class UserService {
    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired //根据类型注入
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;
//    @Resource //根据类型注入
    @Resource(name = "userDaoImpl1") //根据名称注入
    private UserDao userDao;

    public void add () {
        System.out.println("UserService add...." + name);
        userDao.add();
    }
}
