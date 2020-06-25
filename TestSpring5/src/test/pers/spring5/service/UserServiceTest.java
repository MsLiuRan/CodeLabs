package pers.spring5.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}