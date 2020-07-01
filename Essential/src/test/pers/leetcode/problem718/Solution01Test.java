package pers.leetcode.problem718;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void findLength() {
        int[] A = {0,0,0,0,0};
        int[] B = {0,0,0,0,0};
        Solution01 solution01 = new Solution01();
        Assert.assertEquals(5,solution01.findLength(A,B));
    }
}