package pers.leetcode.que0302;

import java.util.Stack;

/**
 * @ClassName MinStack 面试题03.02.栈的最小值
 * @Description 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，
 * 该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/7/3 16:08
 * @Version 1.0
 */
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        int min = Integer.MAX_VALUE;
        if (!minStack.isEmpty()) {
            min = minStack.peek();
        }
        minStack.push(Math.min(min,x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
