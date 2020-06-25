package pers.spring5.collectiontype;

import java.util.List;

/**
 * @ClassName Book
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/25 14:25
 * @Version 1.0
 */
public class Book {
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }
    public void demo () {
        System.out.println(list);
    }
}
