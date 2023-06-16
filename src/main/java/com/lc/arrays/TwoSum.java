package com.lc.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,4,7,9,10};
        int[] res = twoSum(nums,9);
        System.out.println(res[0]+" - "+res[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(m.containsKey(target-nums[i]))
                return new int[] {i,m.get(target-nums[i])};
            m.put(nums[i], i);
        }

        throw new IllegalArgumentException("Not valid input");
    }
}

