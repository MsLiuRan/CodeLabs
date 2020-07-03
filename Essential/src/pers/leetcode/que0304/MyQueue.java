package pers.leetcode.que0304;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName MyQueue 面试题 03.04.化栈为队
 * @Description 实现一个MyQueue类，该类用两个栈来实现一个队列。
 * @Author LiuRan
 * @Date 2020/7/3 16:24
 * @Version 1.0
 */
public class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    public MyQueue() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stack.size() == 1) {
            return stack.pop();
        }
        Stack<Integer> temp = new Stack<Integer>();
        while(stack.size() > 1) {
            temp.push(stack.pop());
        }
        int pop = stack.pop();
        for (int i = 0; i < temp.size(); i++) {
            stack.push(temp.pop());
        }
        return pop;
    }

    public int peek() {
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.size());
        stack.push(1);
        System.out.println(stack.size());
//        MyQueue queue = new MyQueue();
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.empty());
    }
}
