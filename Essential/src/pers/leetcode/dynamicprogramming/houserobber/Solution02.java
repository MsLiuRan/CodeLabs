package pers.leetcode.dynamicprogramming.houserobber;

/**
 * @ClassName Solution2
 * @Description 使用滚动数组空间复杂度O(1)、时间复杂度O(n)
 * @Author LiuRan
 * @Date 2020/5/30 17:34
 * @Version 1.0
 */
public class Solution02 {
    public int rob(int[] nums) {
        if (null == nums || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int res = 0;
        //i-2 房屋最大偷到金额
        int s1 = nums[0];
        //i 房屋最大偷到金额
        int s2 = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = s2;
            s2 = Math.max(s1+nums[i],s2);
            s1 = temp;
        }
        return s2;
    }
}
