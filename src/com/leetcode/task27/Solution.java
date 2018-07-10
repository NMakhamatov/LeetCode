package com.leetcode.task27;

import java.util.Arrays;

//Remove Element
//Accepted
public class Solution {
    public static void main(String[] args) {
        int[] mas = new int[] {1,1,1,1};
        int val = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(mas,val));
        System.out.println(Arrays.toString(mas));
    }
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) {
            if (nums[0] == val) return 0;
            else return 1;
        }
        int end = nums.length - 1;
        end = move(nums,end,val);
        for(int i = 0; i < nums.length; i++) {
            if (nums[i]==val && i<end) {
                nums[i] = nums[i] ^ nums[end];
                nums[end] = nums[i] ^ nums[end];
                nums[i] = nums[i] ^ nums[end];
                end = move(nums,end,val);
            }
        }
        if (nums[end] == val) return 0;
        return end+1;
    }
    private  int move(int[] nums, int end,int val) {
        while(nums[end] == val && end > 0) {
            end--;
        }
        return end;
    }
}
