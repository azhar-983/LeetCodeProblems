package com.lc.linkedlist;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node at which the
 * two lists intersect. If the two linked lists have no intersection at all, return null
 * Note: the linked lists must retain their original structure after the function returns.
 */
public class LLIntersection {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA != curB){
            curA = (curA==null)?headB:curA.next;
            curB = (curB==null)?headA:curB.next;
        }
        // even if no intersection, the second iteration will still run and both nodes
        // reach end node (null) at same time. so both curA and curB will be null
        return curA;
    }
}
