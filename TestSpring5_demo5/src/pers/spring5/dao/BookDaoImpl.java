package pers.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.spring5.entity.Book;

/**
 * @ClassName BookDaoImpl
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/30 22:26
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void add(Book book) {
        //1 创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法实现
        // int update = jdbcTemplate.update(sql,book.getUserId(),book.getUsername(),book.getUstatus());
        Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
}
