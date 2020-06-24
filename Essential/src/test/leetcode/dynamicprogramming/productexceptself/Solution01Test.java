package leetcode.dynamicprogramming.productexceptself;

import org.junit.Assert;
import org.junit.Test;
import pers.leetcode.dynamicprogramming.productexceptself.Solution01;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void productExceptSelf() {
        Solution01 solution01 = new Solution01();
        int[] in = {1,2,3,4};
        Assert.assertArrayEquals(new int[]{24, 12, 8, 6},solution01.productExceptSelf(in));
    }

    @Test
    public void productExceptSelf1() {
        Solution01 solution01 = new Solution01();
        int[] in = {1,2,3,4};
        Assert.assertArrayEquals(new int[]{24, 12, 8, 6},solution01.productExceptSelf1(in));
    }
}