package pers.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void orderDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("orders",Order.class);
        System.out.println(order);
        order.orderDemo();
    }
}