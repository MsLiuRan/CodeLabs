package pers.leetcode.problem215;

import junit.framework.TestCase;
import org.junit.Assert;

public class Solution01Test extends TestCase {

    public void testFindKthLargest() {
        Solution01 solution01 = new Solution01();
        int[] nums = {3,2,1,5,6,4};
        Assert.assertEquals(5,solution01.findKthLargest(nums,2));
    }
}