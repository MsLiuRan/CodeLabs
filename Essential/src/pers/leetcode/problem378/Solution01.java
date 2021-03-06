package pers.leetcode.problem378;

import java.util.Arrays;

/**
 * @ClassName Solution01 378.有序矩阵中第K小的元素
 * @Description 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 * 返回 13。
 * @Author LiuRan
 * @Date 2020/7/2 10:17
 * @Version 1.0
 */
public class Solution01 {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] sorted = new int[rows * columns];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sorted[index++] = num;
            }
        }
        Arrays.sort(sorted);
        return sorted[k-1];
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,2,2}};
        System.out.println(matrix[0].length);
    }
}
