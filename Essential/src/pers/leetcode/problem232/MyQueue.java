package pers.leetcode.problem232;

import java.util.Stack;

/**
 * @ClassName MyQueue 232.用栈实现队列
 * @Description 使用栈实现队列的下列操作：
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/7/1 9:15
 * @Version 1.0
 */
public class MyQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private int head;
    private int headNull;
    public MyQueue() {

    }
    //将一个元素放入队列的尾部
    public void push(int x) {
        if (stack1.isEmpty())
            head = x;
        stack1.push(x);
    }
    //从队列首部移除元素
    public int pop() {
        if (stack1 == null || stack1.size() == 0)
            return headNull;
        while (stack1.size() > 1) {
            int temp = stack1.pop();
            stack2.push(temp);
        }
        int res = stack1.pop();
        if (!stack2.isEmpty())
            head = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }
    //返回队列首部的元素
    public int peek() {
        if (stack1.isEmpty())
            return headNull;
        return head;
    }
    //返回队列首部是否为空
    public boolean empty() {
        return stack1.isEmpty();
    }
}
