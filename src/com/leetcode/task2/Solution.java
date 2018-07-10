package com.leetcode.task2;

import java.io.*;
import java.util.*;

//Add Two Numbers
// not done
public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sol solution = new Sol();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        solution.rec3(listNode1, 1111111111);
        solution.rec3(listNode2, 1111111111);


        ListNode res = solution.addTwoNumbers(listNode1, listNode2);
        solution.rec(res);
    }
}

class Sol {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l1.val == 0) return l2;
        if (l2.next == null && l2.val == 0) return l1;
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> resList = new LinkedList<>();

        rec2(l1, list1);
        rec2(l2, list2);

//        long num1= 0;
//        long num2 = 0;

        int diff = Math.abs(list1.size() - list2.size());
        if (list1.size() > list2.size()) {
            for (int i = 0; i < diff; i++) {
                list2.add(0, 0);
            }
        } else for (int i = 0; i < diff; i++) {
            list1.add(0, 0);
        }


//        for (int i = 0; i < list1.size(); i++) {
//            num1 += (long) list1.get(i) * (Math.pow(10, list1.size() - i - 1));
//        }
//        for (int i = 0; i < list2.size(); i++) {
//            num2 += (long) list2.get(i) * (Math.pow(10, list2.size() - i - 1));
//        }

//        long result = num1 + num2;

//        ListNode res = new ListNode((int) (result % 10));
//        rec3(res, result / 10);
        return null;
    }


    void rec(ListNode listNode) {
        if (listNode.next == null) System.out.print(listNode.val);
        else {
            rec(listNode.next);
            System.out.print(listNode.val);
        }
    }

    void rec2(ListNode listNode, List<Integer> list) {
        if (listNode.next == null) list.add(listNode.val);
        else {
            rec2(listNode.next, list);
            list.add(listNode.val);
        }
    }

    void rec3(ListNode listNode, long i) {
        if (i == 0) return;
        if (i < 10) listNode.next = new ListNode((int) (i % 10));
        else {
            rec3(listNode.next = new ListNode((int) (i % 10)), i / 10);
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
