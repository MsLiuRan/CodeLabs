package pers.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.spring5.dao.BookDao;
import pers.spring5.entity.Book;

/**
 * @ClassName BookService
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/30 22:28
 * @Version 1.0
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book) {
        bookDao.add(book);
    }
}
