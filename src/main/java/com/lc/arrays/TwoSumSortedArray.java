package com.lc.arrays;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers be
 * numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array
 * [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 * Your solution must use only constant extra space.
 */
public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int[] res = twoSum(input,9);
        System.out.println(res[0] +":" + res[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        while (lo<hi){
            if(nums[lo]+nums[hi]==target)
                return new int[]{lo+1,hi+1};
            else if (nums[lo]+nums[hi]>target)
                hi--;
            else
                lo++;
        }
    return null;
    }
}
