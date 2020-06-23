package leetcode.aboutstring.addbinary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution03Test {

    @Test
    public void addBinary() {
        Solution03 s3 = new Solution03();
        Assert.assertEquals("10",s3.addBinary("1","1"));
    }
}