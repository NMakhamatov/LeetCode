package com.leetcode.task38;

//38. Count and Say
//done
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(2));
        System.out.println(solution.countAndSay(3));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(6));
    }
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String prevRes = countAndSay(n-1);
        char[] chars = prevRes.toCharArray();
        int value = 0;
        int amount = 0;
        StringBuilder builder = new StringBuilder();

        for (char c : chars) {
            int currentValue = (int)(c - '0');
            if (value != currentValue) {
                if (value != 0) {
                    builder.append(amount).append(value);
                }
                value = currentValue;
                amount = 1;
            }
            else amount++;
        }
        builder.append(amount).append(value);
        return builder.toString();
    }
}
