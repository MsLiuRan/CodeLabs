package pers.leetcode.problem209;

import pers.utils.ArrayUtil;

import java.util.Arrays;

/**
 * @ClassName Solution01 209长度最小的子数组
 * @Description 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。
 * 如果不存在符合条件的连续子数组，返回 0。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/6/28 19:56
 * @Version 1.0
 */
public class Solution01 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i=0; i < n;i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    ans = Math.min(ans,j-i+1);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
}
