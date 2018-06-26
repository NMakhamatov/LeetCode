package com.leetcode.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Longest Substring Without Repeating Characters
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }
    public int lengthOfLongestSubstring(String s) {
        char[] chars;
        chars = s.toCharArray();
        int max = 0;
        int tempMax = 0;
        int index = 0;
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            if (charSet.add(chars[i])) tempMax++;
            else {
                if (tempMax > max) {
                    max = tempMax;
                }
                tempMax = 1;
                charSet.clear();
                i = ++index;
                charSet.add(chars[i]);
            }
        }
        if (tempMax > max) max = tempMax;
        return max;
    }
}
