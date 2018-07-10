package com.leetcode.task11;

//Container With Most Water
//Accepted
public class Solution {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int max = height[0] > height[1] ? height[1]:height[0];
        for (int i = 0; i < height.length; i++) {
            for (int j = i +1; j < height.length; j++) {
                int min = height[i] < height[j] ? height[i] : height[j];
                int area = min*(j - i);
                if (area > max) max = area;
            }
        } return max;
    }
}
