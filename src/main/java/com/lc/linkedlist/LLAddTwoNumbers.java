package com.lc.linkedlist;

import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class LLAddTwoNumbers {
    public static void main(String[] args) {
        //Call method
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry=0;
        while(l1 != null || l2!=null || carry>0){
            int x= l1!=null?l1.val:0;
            int y= l2!=null?l2.val:0;

            int sum = x+y+carry;
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}
