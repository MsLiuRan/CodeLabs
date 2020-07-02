package pers.spring5.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import pers.spring5.config.TxConfig;

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

    public static void main(String[] args) {

    }
}