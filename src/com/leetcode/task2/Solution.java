package com.leetcode.task2;

import java.io.*;
import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Add Two Numbers
//done
public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sol solution = new Sol();

        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(1);

        solution.write(listNode1, 8);
//        solution.write(listNode2, 12);

        System.out.print("first number:");
        solution.read(listNode1);
        System.out.println();

        System.out.print("second number:");
        solution.read(listNode2);
        System.out.println();

        ListNode res = solution.addTwoNumbers(listNode1, listNode2);
        System.out.print("sum:");
        solution.read(res);
    }
}

class Sol {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.next == null && l1.val == 0) return l2;
        if(l2.next == null && l2.val == 0) return l1;
        ListNode result = null;
        ListNode link = result;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while (l1.next != null){
            str1.append(l1.val);
            l1 = l1.next;
        }str1.append(l1.val);
        while (l2.next != null) {
            str2.append(l2.val);
            l2 = l2.next;
        }str2.append(l2.val);

        String num1 = str1.toString();
        String num2 = str2.toString();

        int len1 = num1.length();
        int len2 = num2.length();
        int len = len1>len2 ? len1 : len2;
        int mem = 0;

        for (int i = 0; i < len; i++) {

            int sum = 0;
            int val1 = 0;
            int val2 = 0;

            if (i < len1) val1 = Character.digit(num1.charAt(i),10);
            if (i < len2) val2 = Character.digit(num2.charAt(i),10);

            sum = val1 + val2 + mem;
            mem = 0;
            if (sum > 9) {
                mem = 1;
                sum = sum % 10;
            }
            if (result == null) {
                result = new ListNode(sum);
                link = result;
            } else {
                link.next = new ListNode(sum );
                link = link.next;
            }

            if (i == len-1 && mem == 1 ) link.next = new ListNode(1);
        }


        return result;
    }


    void read(ListNode listNode) {
        if (listNode.next == null) System.out.print(listNode.val);
        else {
            read(listNode.next);
            System.out.print(listNode.val);
        }
    }

    void write(ListNode listNode, long i) {
        if (i < 10){
            listNode.next = new ListNode((int)i);
        }
        else {
            listNode.next = new ListNode((int)i%10);
            write(listNode.next, i / 10);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
