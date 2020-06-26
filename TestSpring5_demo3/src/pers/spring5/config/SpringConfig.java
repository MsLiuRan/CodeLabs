package pers.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringConfig
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/26 12:09
 * @Version 1.0
 */
@Configuration //作为配置类替代xml配置文件
@ComponentScan(basePackages = {"pers.spring5"})
public class SpringConfig {
}
