package com.lc.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,3,8,6,9,10,12,14};

        findKLargestElements(nums, 3);

    }

    private static void findKLargestElements(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int i=0; i<k; i++){
            minHeap.add(nums[i]);
            maxHeap.add(nums[i]);
        }
        for(int j=k; j<nums.length; j++){
            if(minHeap.peek() > nums[j]){
                continue;
            } else {
                minHeap.poll();
                minHeap.add(nums[j]);
            }

        }
        for(int j=k; j<nums.length;j++){
            if(maxHeap.peek() > nums[j]){
                continue;
            } else {
                maxHeap.poll();
                maxHeap.add(nums[j]);
            }
        }
        minHeap.stream().forEach(System.out::print);
        System.out.println();
        maxHeap.stream().forEach(System.out::print);
    }
}
