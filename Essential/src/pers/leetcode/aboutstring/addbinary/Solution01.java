package leetcode.aboutstring.addbinary;

import java.math.BigDecimal;

/**
 * @ClassName Solution01
 * @Description 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * @Author LiuRan
 * @Date 2020/6/23 10:48
 * @Version 1.0
 */
public class Solution01 {
    public String addBinary(String a, String b) {
        if (null == a || a.length() < 1) {
            if (null == b || b.length() < 1) {
                return "0";
            } else {
                return b;
            }
        }
        if (null == b || b.length() < 1)
            return a;
        if (a.length() > Math.pow(10,4) || b.length() > Math.pow(10,4))
            return "";
        int lenA = a.length();
        int lenB = b.length();
        long dA = 0;//a十进制数
        long dB = 0;//b十进制数
        int tmpA = 0;//计数器
        int tmpB = 0;//计数器
        for (char ch:a.toCharArray()) {
            int n = lenA - 1 -tmpA;
            if (ch == '1')
                dA += Math.pow(2,n);
            tmpA++;
        }
        for (char ch:b.toCharArray()) {
            int n = lenB - 1 -tmpB;
            if (ch == '1')
                dB += Math.pow(2,n);
            tmpB++;
        }
        long result = dA + dB;
        System.out.println("dA=" + dA);
        System.out.println("dB=" + dB);
        System.out.println("result=" + result);
        return Long.toBinaryString(result);
    }
}
