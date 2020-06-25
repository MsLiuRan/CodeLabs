package pers.spring5.bean;

/**
 * @ClassName Orders
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 15:57
 * @Version 1.0
 */
public class Orders {
    private String oname;
    public Orders() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }
    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部 调用set方法设置属性值");
    }
    public void initMethod() {
        System.out.println("第三步 调用初始化方法");
    }
    public void destroyMethod() {
        System.out.println("第五步 调用销毁方法");
    }
}
