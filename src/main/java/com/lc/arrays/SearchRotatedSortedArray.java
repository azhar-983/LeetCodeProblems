package com.lc.arrays;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Given the array nums after the possible rotation and an integer target, return the index of
 * target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 *  //[4,5,6,7,0,1,2]
 */
public class SearchRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target)
                return mid;
            else if (nums[mid] > nums[hi]) {
                if(nums[lo]<target && target<nums[mid]){ // [4,5,6,7,0,1,2] target=0
                    hi = mid-1;
                } else {
                    lo= mid+1;
                }
            }else {
                if(nums[hi]>target && nums[mid]<target)
                    lo = mid+1;
                else
                    hi = mid-1;
            }
        }
        return -1;
    }
}
