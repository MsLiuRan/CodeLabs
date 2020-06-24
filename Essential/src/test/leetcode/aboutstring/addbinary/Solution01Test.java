package leetcode.aboutstring.addbinary;

import org.junit.Assert;
import org.junit.Test;
import pers.leetcode.aboutstring.addbinary.Solution01;

import static org.junit.Assert.*;

public class Solution01Test {

    @Test
    public void addBinary() {
        Solution01 s1 = new Solution01();
        Assert.assertEquals("1",s1.addBinary("1",""));
    }
}