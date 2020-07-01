package pers.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.spring5.dao.BookDao;
import pers.spring5.entity.Book;

import java.util.List;

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
    //修改方法
    public void updateBook(Book book) {
        bookDao.update(book);
    }
    //删除方法
    public void deleteBook(String id) {
        bookDao.delete(id);
    }
    public int findCount() {
        return bookDao.selectCount();
    }
    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }
    public List<Book> findAll() {
        return bookDao.findBookAll();
    }
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAdd(batchArgs);
    }
    public void batchUpdateBook(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }
    //批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDelete(batchArgs);
    }

}
