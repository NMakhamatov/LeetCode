package com.leetcode.task8;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//String to Integer (atoi)
//решил
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "  +999999999999999999569";
        System.out.println(solution.myAtoi(s));
    }

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        Pattern pattern = Pattern.compile("^(\\u0020)*[-+]?\\d+");
        Matcher matcher = pattern.matcher(str);
        String res = "0";
        BigInteger min = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        BigInteger max = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        if (matcher.find()) {
            res = matcher.group();
            res = res.trim();
        }
        BigInteger bigInteger = new BigInteger(res);
        if (min.compareTo(bigInteger) > 0 ) bigInteger = min;
        if (max.compareTo(bigInteger) < 0) bigInteger = max;
        return bigInteger.intValue();
    }
}
