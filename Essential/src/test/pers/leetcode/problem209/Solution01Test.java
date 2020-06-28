package pers.leetcode.problem209;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void minSubArrayLen() {
        int[] nums = {2,3,1,2,4,3};
        Solution01 solution01 = new Solution01();
        int out = solution01.minSubArrayLen(7,nums);
        Assert.assertEquals(2,out);
    }
}