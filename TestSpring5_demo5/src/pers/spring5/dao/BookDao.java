package pers.spring5.dao;

import pers.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);
    void update(Book book);
    void delete(String id);
    int selectCount();

    Book findBookInfo(String id);

    List<Book> findBookAll();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
