package pers.leetcode.problem1021;

import junit.framework.TestCase;
import org.junit.Assert;

public class Solution01Test extends TestCase {

    public void testRemoveOuterParentheses() {
        Solution01 solution01 = new Solution01();
        String in = "(()())(())(()(()))";
        String out = "()()()()(())";
        Assert.assertEquals(out,solution01.removeOuterParentheses(in));
    }
}