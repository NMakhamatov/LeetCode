package com.leetcode.task5;

import java.util.ArrayList;
import java.util.List;

// 5. Longest Palindromic Substring
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("abcda"));
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length()==0) return "";
        else if (s.length() == 1) return s;
        else if (s.length() == 2 && s.charAt(0)==s.charAt(1)) return s;
        else if(s.length() == 2) {
            return s.substring(0,1);
        }

        String max = s.substring(0,1);
        String tempMax = "";

        char[] chars = s.toCharArray();
            for (int i = 1; i < s.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    if (i-j<0 || i+j>s.length()-1) continue;
                    if (chars[i-j] == chars[i+j]) tempMax = s.substring(i-j,i+j+1);
                    if (tempMax.length()>max.length()) max = tempMax;
                }

            }

            for (int i = 0; i < s.length()-1 ; i++) {
                if (chars[i] == chars[i+1]) {
                    tempMax = s.substring(i,i+2);
                    if (tempMax.length() > max.length()) max = tempMax;
                    for (int j = 1; j <= i; j++) {
                        if (i-j < 0 || i+j+1 > s.length()-1) continue;
                        if (chars[i-j] == chars[i+j+1]) tempMax = s.substring(i-j,i+j+2);
                        if (tempMax.length() > max.length()) max = tempMax;
                    }
                }
            }
        return max;
    }
}
