package pers.leetcode.offer30;

import junit.framework.TestCase;

public class MinStackTest extends TestCase {

    public void testMin() {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        System.out.println("null");
        minStack.push(2147483646);
        System.out.println("null");
        minStack.push(2147483647);
        System.out.println("null");
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println("null");
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println("null");
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println("null");
        minStack.push(2147483647);
        System.out.println("null");
        System.out.println(minStack.top());
        System.out.println(minStack.min());
        minStack.push(-2147483648);
        System.out.println("null");
        System.out.println(minStack.top());
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println("null");
        System.out.println(minStack.min());

        
    }
}