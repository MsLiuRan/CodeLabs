package pers.spring5;

/**
 * @ClassName Order
 * @Description 使用有参构造注入
 * @Author LiuRan
 * @Date 2020/6/24 22:49
 * @Version 1.0
 */
public class Order {
    private String oname;
    private String address;

    //有参构造
    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderDemo () {
        System.out.println(oname + "::" + address);
    }
}
