package com.lc.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        /*q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);*/
        System.out.println(q.peek());
        q.poll();
        //q.element();
        q.remove();
        q.offer(50);
        //System.out.println(((LinkedList<Integer>) q).offerFirst(20));
        System.out.println(q);
    }
}
class QueueDS{
    int front,rear=-1;
    int capacity;
    public QueueDS(int capacity){
        this.capacity = capacity;
    }
}
