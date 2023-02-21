package com.lc.linkedlist;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 1-2-3-4-5-null
 * 5-4-3-2-1-null
 */
public class LLReverse {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return null;
    }
}
