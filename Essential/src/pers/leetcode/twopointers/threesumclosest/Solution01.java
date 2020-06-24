package leetcode.twopointers.threesumclosest;

/**
 * @ClassName Solution01
 * @Description 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/6/24 20:39
 * @Version 1.0
 */
public class Solution01 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int num = nums[0] + nums[1] + nums[2];
        for (int i = 0; i + 2 < nums.length; i++) {
            for (int j = i + 1; j + 1 < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int a, b;
                    a = num - target >= 0 ? num - target : target - num;
                    if (nums[i] + nums[j]+nums[k]-target>=0) {
                        b = nums[i] + nums[j] + nums[k] - target;
                    } else {
                        b = target - nums[i] - nums[j] - nums[k];
                    }
                    if (a > b) {
                        num = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return num;
    }
}
