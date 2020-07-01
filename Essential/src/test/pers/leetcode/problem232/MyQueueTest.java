package pers.leetcode.problem232;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {
    @Test
    public void testMyQueue() {
        MyQueue obj = new MyQueue();
        int pop1 = obj.pop();
        System.out.println("pop::" + pop1);
    }
}