package pers.leetcode.problem215;

import pers.utils.ArrayUtil;

import java.util.Arrays;

/**
 * @ClassName Solution01 215.数组中的第K个最大元素
 * @Description 在未排序的数组中找到第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @Author LiuRan
 * @Date 2020/6/29 15:07
 * @Version 1.0
 */
public class Solution01 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length)
            return 0;
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
