package pers.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.spring5.config.SpringConfig;
import pers.spring5.service.UserService;

import javax.swing.*;

public class TestSpring5Demo3 {

    @Test
    public void testUserService1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testUserService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }
}