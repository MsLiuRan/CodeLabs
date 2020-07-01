package pers.spring5.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.spring5.entity.Book;
import pers.spring5.service.BookService;

import static org.junit.Assert.*;

public class BookDaoImplTest {

    @Test
    public void addJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }
}