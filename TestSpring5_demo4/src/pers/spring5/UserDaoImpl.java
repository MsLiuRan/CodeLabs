package pers.spring5;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName UserDaoImpl
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/28 22:09
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a + b;
    }
    @Override
    public String update(String id) {
        System.out.println("update方法执行了...");
        return id;
    }
}
