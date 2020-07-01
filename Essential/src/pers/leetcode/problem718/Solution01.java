package pers.leetcode.problem718;

/**
 * @ClassName Solution01 718.最长重复子数组  暴力解法 O(n^3) 超出时间限制
 * @Description 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * 输入:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出: 3
 * 解释:
 * 长度最长的公共子数组是 [3, 2, 1]。
 * @Author LiuRan
 * @Date 2020/7/1 11:06
 * @Version 1.0
 */
public class Solution01 {
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int k = 0;
                int temp = i + k;
                while ((i+k) < A.length && (j+k) < B.length && A[i+k] == B[j+k]){
                    k += 1;
                    if ((i+k) > A.length-1 || (j+k) > B.length-1) {
                        break;
                    }
                }
                ans = Math.max(ans,k);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(1+2);
    }
}
