package leetcode.dynamicprogramming.houserobber;

import javax.sound.midi.Soundbank;

/**
 * @ClassName Solution01
 * @Description 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *     偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author LiuRan
 * @Date 2020/5/30 15:27
 * @Version 1.0
 */
public class Solution01 {
    /**
     * 第一次答案完全错误，看过答案后，尝试复写
     *@Description 对数组遍历一次时间复杂度O(n)、空间复杂度O(n)
     *@Author LiuRan
     *@Date 2020/5/30 17:11
     *@Param [nums]
     *@return int
     */
    public int rob(int[] nums) {
        //数组为空抢劫金额为0
        if (null == nums || nums.length == 0) {
            return 0;
        }
        //只有一间屋子
        if (nums.length == 1) {
            return nums[0];
        }
        //两间屋子
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        //大于2间
        //设有k间屋子 每间屋子金额为 H(k)
        //偷第k间屋子时，所能偷到的金额为S(k)
        //此时有两种选择
        //1.偷第k间 偷到的金额 S(k) = S(k-2) + H(k)
        //2.不偷第k间 偷到的金额 S(k-1)
        //k间屋子所能偷到的金额为 max(S(k-1),S(k))
        //即 S(k) = max(S(k-2)+H(k),S(k-1))
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            arr[i] = Math.max(arr[i-2] + nums[i],arr[i-1]);
        }
        return arr[arr.length-1];
    }
}
