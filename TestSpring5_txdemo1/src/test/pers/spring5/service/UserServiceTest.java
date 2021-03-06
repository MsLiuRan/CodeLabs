package pers.spring5.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.transaction.PlatformTransactionManager;
import pers.spring5.config.TxConfig;
import pers.spring5.entity.User;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void accountMoney() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    @Test
    public void accountMoney1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    @Test
    public void accountMoney2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testGenericApplicationContext() {
        //1 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用context的方法对象注册
        context.refresh();
        //context.registerBean(User.class,() -> new User());
        context.registerBean("user1",User.class,() -> new User());
        //3 获取在spring注册的对象
        //User user = (User)context.getBean("pers.spring5.entity.User");
        User user = (User)context.getBean("user1");
        System.out.println(user);
    }
}