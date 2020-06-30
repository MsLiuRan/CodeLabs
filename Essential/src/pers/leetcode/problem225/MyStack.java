package pers.leetcode.problem225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName 225.用队列实现栈
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/30 14:51
 * @Version 1.0
 */
public class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;
    public MyStack() {

    }
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int res = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return res;
    }
    public int top() {
        return top;
    }
    public boolean empty() {
        return q1.isEmpty();
    }
}
