package com.leetcode.task38;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello";
        List<Character> list = s.chars().boxed().map(x -> (char)x.intValue()).collect(Collectors.toList());
        System.out.println(list.toString());
    }
    public String countAndSay(int n) {
        if (n == 1) return "1";
        countAndSay(n-1);
        StringBuilder builder = new StringBuilder();
        int i = n/10;
    }
}
