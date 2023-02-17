package com.lc.arrays;

/**
 * 
 * @author asayyed
 * 
 * Given an integer array nums and an integer val, remove all occurrences of val in 
 * nums in-place. The relative order of the elements may be changed.
 * Return k after placing the final result in the first k slots of nums.	
 * 
 * Do not allocate extra space for another array. You must do this by modifying 
 * the input array in-place with O(1) extra memory.
 */
public class RemoveElement {

	public static void main(String[] args) {
		

	}
	//remove the elements from the array when match found.
	public int removeElement(int[] nums, int val) {
		int c=0;
		for(int i:nums) {
			if(i != val) {
				nums[c]=nums[i];
				c++;
			}
		}
		return c;
	}
}
