package pers.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName ConfigAop
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/29 22:49
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"pers.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
