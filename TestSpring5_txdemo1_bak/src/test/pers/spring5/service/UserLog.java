package pers.spring5.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * @ClassName UserLog
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/7/2 22:25
 * @Version 1.0
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
