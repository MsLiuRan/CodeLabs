package pers.leetcode.array.firstmissingpositive;

import pers.utils.ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution01 41.缺失的第一个正数
 * @Description 给你一个未排序的整数数组，
 * 请你找出其中没有出现的最小的正整数。
 * @Author LiuRan
 * @Date 2020/6/27 21:22
 * @Version 1.0
 */
public class Solution01 {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length < 1)
            return 1;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int endNum = nums[nums.length-1];
        if (endNum < 0) {
            endNum = 1;
        } else if (endNum < Integer.MAX_VALUE) {
            endNum += 1;
        } else{

        }
        for (int i = 1; i < endNum; i++) {
            if (set.contains(i)){
                continue;
            } else {
                return i;
            }
        }
        return endNum;
    }
}
