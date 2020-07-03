package pers.leetcode.problem1047;

import java.util.Stack;

/**
 * @ClassName Solution01 1047.删除字符串中的所有相邻重复项
 * @Description 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/7/3 9:35
 * @Version 1.0
 */
public class Solution01 {
    public String removeDuplicates(String S) {
        String ans = "";
        Stack<Character> stack = new Stack<Character>();
        do{
            stack = remove(S);
        }while (check(stack));
        for (Character ch : stack) {
            ans += ch;
        }
        return ans;
    }

    public static Stack<Character> remove(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty()) {
                if (ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack;
    }

    public static boolean check(Stack<Character> stack) {
        boolean flag = false;
        int i = 0;
        for (Character ch : stack) {
            if (i > 0 && ch == stack.get(i)) {
                flag = true;
            }
        }
        return flag;
    }
}
