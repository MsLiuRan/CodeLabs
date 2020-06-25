package pers.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Stu
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 11:23
 * @Version 1.0
 */
public class Stu {
    //1.数组类型属性
    private String[] courses;
    //2.List集合类型属性
    private List<String> list;
    //3.Map集合类型属性
    private Map<String,String> map;
    //4.Set集合类型属性
    private Set<String> sets;
    //学生学多门课程
    private List<Course> courseList;
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void demo () {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
