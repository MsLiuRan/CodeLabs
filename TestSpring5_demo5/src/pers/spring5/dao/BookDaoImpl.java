package pers.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.spring5.entity.Book;

import java.util.Arrays;
import java.util.List;

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

    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id = ?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> findBookAll() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] inst = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(inst));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
