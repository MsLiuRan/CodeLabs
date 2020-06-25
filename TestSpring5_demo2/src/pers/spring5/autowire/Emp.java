package pers.spring5.autowire;

/**
 * @ClassName Emp
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 16:30
 * @Version 1.0
 */
public class Emp {
    private Dept dept;
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
    public void demo () {
        System.out.println(dept);
    }
}
