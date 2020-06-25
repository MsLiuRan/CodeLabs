package pers.spring5;

/**
 * @ClassName Book
 * @Description 使用set方法注入属性
 * @Author LiuRan
 * @Date 2020/6/24 21:59
 * @Version 1.0
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo () {
        System.out.println(bname + "::" + bauthor + "::" + address);
    }
}
