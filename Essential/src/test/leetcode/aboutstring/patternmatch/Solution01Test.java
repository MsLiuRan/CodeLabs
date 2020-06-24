package leetcode.aboutstring.patternmatch;

import org.junit.Assert;
import org.junit.Test;
import pers.leetcode.aboutstring.patternmatch.Solution01;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void patternMatching() {
        Solution01 s1 = new Solution01();
        String para = "abba";
        String value = "dogcatcatdog";
        Assert.assertEquals(true,s1.patternMatching(para,value));
    }
}