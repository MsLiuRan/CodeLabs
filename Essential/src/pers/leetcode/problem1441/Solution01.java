package pers.leetcode.problem1441;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Solution01 1441.用栈操作构建数组
 * @Description 给你一个目标数组 target 和一个整数 n。每次迭代，需要从  list = {1,2,3..., n} 中依序读取一个数字。
 * 请使用下述操作来构建目标数组 target ：
 * Push：从 list 中读取一个新元素， 并将其推入数组中。
 * Pop：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 * 题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
 * 请返回构建目标数组所用的操作序列。
 * 题目数据保证答案是唯一的。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/build-an-array-with-stack-operations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/7/3 10:41
 * @Version 1.0
 */
public class Solution01 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<String>();
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = target.length;
        int last = target[len-1];
        for (int in : target) {
            map.put(in,in);
        }
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            list.add("Push");
            if (!stack.isEmpty() ) {
                if(!map.containsKey(i)) {
                    stack.pop();
                    list.add("Pop");
                }
            }
            if (last <= n && last == i) {
                break;
            }
        }
        return list;
    }
}
