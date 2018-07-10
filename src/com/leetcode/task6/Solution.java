package com.leetcode.task6;

//ZigZag Conversion
//Accepted
public class Solution {
    public static void main(String[] args) {
//        int i;
        Solution solution = new Solution();
        System.out.println(solution.convert("PA",  4));
    }
    public String convert(String s, int numRows) {
        if (numRows <= 0) return "";
        if (numRows == 1) return s;
        if (s == null) return "";
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        int index = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuilders[index].append(chars[i]);
            index = ((i/(numRows-1))%2) == 0 ? ++index: --index;
        }
        String result = "";
        for (int i = 0; i < stringBuilders.length; i++) {
            result = result.concat(stringBuilders[i].toString());
        }
        return result;
    }
}
