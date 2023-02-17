package com.lc.arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that
 * is missing from the array.
 *
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4};
        int result = missingNumber(nums);
        System.out.println(result);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0, sum=0;
        for(int i:nums)
            sum = sum+i;
        return n*(n+1)/2-sum;
    }
}
