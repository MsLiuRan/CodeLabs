package pers.leetcode.dynamicprogramming.productexceptself;

import utils.ArrayUtil;

/**
 * @ClassName Solution01 238. 除自身以外数组的乘积
 * @Description 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 示例:
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/product-of-array-except-self
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/6/4 19:22
 * @Version 1.0
 */
public class Solution01 {
    /**
     * 时间复杂度O(n) 空间复杂度常数（返回值本身不算复杂度）
     * @param nums
     * @return
     */
    public int[] productExceptSelf1(int[] nums) {
        if(null == nums || nums.length == 0) {
            return new int[]{};
        }
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = 1;
        for (int i = 1; i < length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int r = 1;
        for (int i = length-1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r = r*nums[i];
        }
        return ans;
    }


    /**
     * 时间复杂度 O(n) 空间复杂度O(n)
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        if(null == nums || nums.length == 0)
            return new int[]{};
        int length = nums.length;//数组长度
        int[] left = new int[length];//左数组，数组中每个元素是nums[i]的左侧的积
        int[] right = new int[length];//右数组，数组中的每个元素是nums[i]的右侧的积
        left[0] = 1;
        right[length-1] = 1;
        if (length == 1)
            return left;
        for (int i = 1; i < length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        ArrayUtil.printArray(left);
        for (int i = length-2; i >= 0 ; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        ArrayUtil.printArray(right);
        for (int i = 0; i < length; i++) {
            left[i] = left[i] * right[i];
        }
        ArrayUtil.printArray(left);
        return left;
    }
}
