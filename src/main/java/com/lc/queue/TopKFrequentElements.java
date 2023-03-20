package com.lc.queue;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,2,2,2,3};
        int[] result = topKFrequent(input,3);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        // construct frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //[1,3]
        //[2,2]
        //[3,1]

        //max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){
            maxHeap.add(key);
        }

        //either max heap or sort as per frequency
        //List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        //Collections.sort(list,(o1,o2)->o2.getValue()- o1.getValue());

        //gather result
        for(int i=0;i<k;i++){
            //result[i] = list.get(i).getKey();
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
