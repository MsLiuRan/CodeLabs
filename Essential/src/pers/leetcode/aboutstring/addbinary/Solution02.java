package leetcode.aboutstring.addbinary;

/**
 * @ClassName Solution02
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/23 12:01
 * @Version 1.0
 */
public class Solution02 {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
}
