package pers.leetcode.problem718;

/**
 * @ClassName Solution02
 * @Description
 * @Author LiuRan
 * @Date 2020/7/1 12:24
 * @Version 1.0
 */
public class Solution02 {
    public int findLength(int[] A,int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] dp = new int[n+1][m+1];
        int ans = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i+1][j+1]+1:0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
