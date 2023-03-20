package com.lc.linkedlist;

public class LinkedList {
    public ListNode head;
    LinkedList(){
        head = null;
    }
    public void insert(ListNode node){
        if(head==null){
            head = node;
            return;
        }
    }
}
