package pers.leetcode.array.firstmissingpositive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void firstMissingPositive() {
        Solution01 solution01 = new Solution01();
        int[] nums = {1,2,3,10,2147483647,9};
        Assert.assertEquals(4,solution01.firstMissingPositive(nums));
    }
}