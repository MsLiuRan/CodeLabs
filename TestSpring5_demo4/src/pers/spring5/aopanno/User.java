package pers.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/29 21:45
 * @Version 1.0
 */
//被增强类
@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
