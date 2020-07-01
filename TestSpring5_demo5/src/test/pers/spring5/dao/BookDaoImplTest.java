package pers.spring5.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.spring5.entity.Book;
import pers.spring5.service.BookService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoImplTest {

    @Test
    public void addJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("PHP");
//        book.setUstatus("b");
//        bookService.updateBook(book);

//        bookService.deleteBook("1");
//        int count = bookService.findCount();
//        System.out.println(count);
//        Book book = bookService.findOne("1");
//        System.out.println(book);
//        List<Book> bookList = bookService.findAll();
//        System.out.println(bookList);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"4","matlab","m"};
//        Object[] o2 = {"5","C++","sdf"};
//        Object[] o3 = {"6","Mysql","mu"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"json","爱我中华","4"};
//        Object[] o2 = {"javascript","歌唱祖国","5"};
//        Object[] o3 = {"pptd","nihaos","6"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdateBook(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o2 = {"2"};
        Object[] o3 = {"3"};
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}