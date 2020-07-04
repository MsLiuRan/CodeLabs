package pers.leetcode.problem32;

import java.util.Stack;

/**
 * @ClassName Solution01 32.最长有效括号
 * @Description 给定一个只包含 '(' 和 ')' 的字符串，
 * 找出最长的包含有效括号的子串的长度。
 * @Author LiuRan
 * @Date 2020/7/4 20:58
 * @Version 1.0
 */
public class Solution01 {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans,i-stack.peek());
                }
            }
        }
        return maxans;
    }
}
