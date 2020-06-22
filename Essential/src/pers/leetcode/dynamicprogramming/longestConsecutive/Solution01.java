package leetcode.dynamicprogramming.longestConsecutive;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * @ClassName Solution01 128. 最长连续序列
 * @Description 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 * 示例:
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/6/6 08:39
 * @Version 1.0
 */
public class Solution01 {
    public int longestConsecutive (int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        ArrayUtil.printArray(nums);

        return 0;
    }
}
