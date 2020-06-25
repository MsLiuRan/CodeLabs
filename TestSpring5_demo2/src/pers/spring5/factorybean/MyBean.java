package pers.spring5.factorybean;

import org.hamcrest.Factory;
import org.springframework.beans.factory.FactoryBean;
import pers.spring5.collectiontype.Course;

/**
 * @ClassName MyBean
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 14:50
 * @Version 1.0
 */
public class MyBean  implements FactoryBean<Course> {
    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
