package pers.spring5.bean;

/**
 * @ClassName Dept
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 10:50
 * @Version 1.0
 */
//部门类
public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
