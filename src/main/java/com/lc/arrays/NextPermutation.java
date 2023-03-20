package com.lc.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] input = new int[]{1,1,5,4,1};
        nextPermutation(input);
        Arrays.stream(input).forEach(System.out::println);
    }

    public static void nextPermutation(int[] nums) {

        int i=nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1])
            i--;

        if(i>=0){
            int j=nums.length-1;
            while (nums[i]>=nums[j])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
