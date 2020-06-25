package pers.spring5.collectiontype;

/**
 * @ClassName Course
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 14:15
 * @Version 1.0
 */
public class Course {
    private String cname;
    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
