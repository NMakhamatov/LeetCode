package com.leetcode.task7;

//Reverse Integer
//Done!
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1236469));
    }

    public int reverse(int x) {
        if (x == 0) return 0;
        int result;
        String s;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
            s = Integer.toString(x);
            char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
        }
            s = new String(chars);
            try {
                result = Integer.valueOf(s);
            } catch (NumberFormatException e) {
                result = 0;
            }
            if (isNegative) result = result * (-1);
        return result;
    }
}
