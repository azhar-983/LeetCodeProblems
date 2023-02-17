package com.lc.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateExists {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,2};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums){
         Set<Integer> values = new HashSet<Integer>();
         for(int i:nums) {
             if (values.contains(i))
                 return true;
             else
                 values.add(i);
         }
         return false;
    }
}
