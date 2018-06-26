package com.leetcode.task4;

import java.util.Arrays;

//Median of Two Sorted Arrays
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[] {1,5,100};
        int[] b = new int[] {16,56,366};
        Solution solution = new Solution();
        solution.findMedianSortedArrays(a,b);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double med =0;
        for (int i : nums1) {
            med += i;
        }
        for (int i : nums2) {
            med += i;
        }
        med /= (nums1.length + nums2.length);
        System.out.println(med);
        return med;
    }
}
