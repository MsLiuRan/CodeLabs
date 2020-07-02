package pers.spring5.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName JTest
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/7/2 23:15
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest {
    @Autowired
    private UserService userService;
    @Test
    public void test1() {
        userService.accountMoney();
    }

}
