package pers.spring5.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonProxy
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/29 22:27
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    //后置通知（返回通知）
    @Before(value = "execution(* pers.spring5.aopanno.User.add(..))")
    public void personBefore(){
        System.out.println("personBefore....");
    }
}
