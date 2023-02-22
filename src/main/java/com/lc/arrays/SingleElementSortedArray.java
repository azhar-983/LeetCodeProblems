package com.lc.arrays;

/**
 * You are given a sorted array consisting of only integers where every element appears
 * exactly twice, except for one element which appears exactly once.
 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.
 */
public class SingleElementSortedArray {
    public static void main(String[] args) {

    }
    //use binary search
    //if mid is even, then it's duplicate should be in next index.
    //if mid is odd, then it's duplicate  should be in previous index.
    //if any of the conditions is satisfied, then pattern is not missed
    public int singleNonDuplicate(int[] nums) {
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                lo=mid+1;
            }
            else
                hi = mid;
        }
        return nums[lo];
    }
}
