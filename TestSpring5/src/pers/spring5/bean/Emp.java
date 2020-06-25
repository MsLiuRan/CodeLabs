package pers.spring5.bean;

/**
 * @ClassName Emp
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 10:51
 * @Version 1.0
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门
    private Dept dept;
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public Dept getDept() {
        return dept;
    }
    public void add () {
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
