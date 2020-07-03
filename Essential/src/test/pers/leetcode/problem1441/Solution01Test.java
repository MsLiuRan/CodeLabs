package pers.leetcode.problem1441;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class Solution01Test extends TestCase {

    @Test
    public void testBuildArray() {
        Solution01 solution01 = new Solution01();
        int[] target = {2,3,4};
        int nums = 4;
        List<String> list = solution01.buildArray(target, nums);
        System.out.println(list);
    }
}