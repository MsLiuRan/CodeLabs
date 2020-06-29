package pers.leetcode.problem1;

/**
 * @ClassName Solution01 1.两数之和
 * @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
 * 并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/6/29 16:04
 * @Version 1.0
 */
public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    start = i;
                    end = j;
                }
            }
        }
        return new int[]{start,end};
    }
}
