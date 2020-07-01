package pers.leetcode.problem20;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void isValid() {
        Solution01 solution01 = new Solution01();
        String str = "([])";
        Assert.assertEquals(true,solution01.isValid(str));
    }
}