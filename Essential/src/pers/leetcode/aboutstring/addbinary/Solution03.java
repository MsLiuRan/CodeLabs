package pers.leetcode.aboutstring.addbinary;

/**
 * @ClassName Solution03
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/6/23 14:07
 * @Version 1.0
 */
public class Solution03 {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(),b.length());
        int carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;

            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;

            System.out.println("carry%2=" + carry%2);
            System.out.println("carry%2 + '0'=" + (carry%2 + '0'));
            System.out.println((char) (carry%2 + '0'));
            ans.append((char) (carry%2 + '0'));

            carry /= 2;
        }
        if (carry > 0)
            ans.append('1');
        ans.reverse();
        return ans.toString();
    }
}
