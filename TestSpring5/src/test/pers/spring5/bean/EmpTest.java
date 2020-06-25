package pers.spring5.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class EmpTest {

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean(Emp.class);
        emp.add();
    }

    @Test
    public void add1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean(Emp.class);
        emp.add();
    }
}