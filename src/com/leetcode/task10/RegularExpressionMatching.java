package com.leetcode.task10;

//RegularExpressionMatching
//done
public class RegularExpressionMatching {
    public static void main(String[] args) {
        RegularExpressionMatching regex = new RegularExpressionMatching();
        System.out.println(regex.isMatch("mississippi","mis*is*p*."));
    }
        public boolean isMatch(String s, String p) {
            return s.matches(p);
        }

}
