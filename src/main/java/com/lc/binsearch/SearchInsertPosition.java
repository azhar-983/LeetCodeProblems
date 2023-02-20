package com.lc.binsearch;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        int res = searchInsert(input,5);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            else if(target > nums[mid])
                lo=mid+1;
            else
                hi=mid-1;
        }
        return lo;
    }
}
