package pers.leetcode.problem844;

import java.util.Stack;

/**
 * @ClassName Solution01 844.比较含退格的字符串
 * @Description 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/backspace-string-compare
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/7/3 9:15
 * @Version 1.0
 */
public class Solution01 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(ch);
            }
        }
        for (int i = 0; i < T.length(); i++) {
            char ch = T.charAt(i);
            if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(ch);
            }
        }
        return stack1.equals(stack2);
    }
}
