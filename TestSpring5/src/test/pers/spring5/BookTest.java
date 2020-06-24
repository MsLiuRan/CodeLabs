package pers.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testDemo() {
        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        book.testDemo();
    }
}