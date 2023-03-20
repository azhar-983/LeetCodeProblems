package com.lc.linkedlist;

/**
 * Given the head of a sorted linked list, delete all
 * duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class LLDeleteDuplicates {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            } else{
                cur = cur.next;
            }
        }
        return head;
    }
}
