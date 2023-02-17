package com.lc.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 5, 7, 9, 4, 7, 5};
        System.out.println(getTwoSumIndexes(input, 12));
    }

    //input [2,3,5,7,9,4,7,5]
    public static List<List<Integer>> getTwoSumIndexes(int[] nums, int target) {
        if (nums.length == 0)
            return null;
        Map<Integer, List<Integer>> m = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> matchList = new ArrayList<>();
            List<Integer> pair = new ArrayList<>();
            if (m.containsKey(target - nums[i])) {
                matchList = m.get(target-nums[i]);
                matchList.add(i);
                pair.add(target - nums[i]);
                pair.add(i);
                res.add(pair);
            }
            matchList.add(i);
            m.put(nums[i], matchList);
        }
        return res;
    }
}
