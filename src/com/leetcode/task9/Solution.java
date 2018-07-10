package com.leetcode.task9;

import java.util.ArrayList;
import java.util.List;

//Palindrome Number
//done
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(+44));
    }
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        else if (x < 0) return false;
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x%10);
            x /=10;
        }
        for (int i = 0; i < list.size()/2; i++) {
            if (!(list.get(i)).equals(list.get(list.size()-1-i))) return false;
        }
        return true;
    }
}
