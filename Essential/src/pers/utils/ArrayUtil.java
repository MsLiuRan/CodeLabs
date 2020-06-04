package utils;

/**
 * @ClassName ArrayUtil
 * @Description 数组处理工具类
 * @Author LiuRan
 * @Date 2020/6/4 20:11
 * @Version 1.0
 */
public class ArrayUtil {
    public static void main(String[] args) {

    }

    public static void printArray (int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + ",";
        }
        str = str.substring(0,str.length()-1) + "]";
        System.out.println(str);
    }

    public static void printArray (String[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + ",";
        }
        str = str.substring(0,str.length()-1) + "]";
        System.out.println(str);
    }
}
