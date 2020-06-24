package leetcode.dynamicprogramming.houserobber;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pers.leetcode.dynamicprogramming.houserobber.Solution01;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void rob() {
        Solution01 solution = new Solution01();
        int[] in = {2,7,9,3,1};
        solution.rob(in);
        Assert.assertEquals(12,solution.rob(in));
    }
}