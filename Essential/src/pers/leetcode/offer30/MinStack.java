package pers.leetcode.offer30;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName MinStack 剑指 Offer30.包含min函数的栈
 * @Description 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author LiuRan
 * @Date 2020/7/2 11:02
 * @Version 1.0
 */
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack () {

    }
    public void push(int x) {
        stack.push(x);
        min = Math.min(min,x);
        minStack.push(min);
    }
    public void pop() {
        stack.pop();
        minStack.pop();
        if (stack.empty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = minStack.peek();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int min() {
        return minStack.peek();
    }
}
