package pers.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.spring5.User;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void add() {
        //1.加载Spring配置文件
        //配置文件在src下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}