/**
 * 
 */
package com.lc.arrays;

/**
 * @author asayyed
 * Given a sorted array nums, remove the duplicates in-place such that each element appear 
 * only once and return the new length. Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,2,3,3,4,4,4,4,4,5,6,10,76};
		RemoveDuplicates rd = new RemoveDuplicates();
		int res = rd.removeDuplicates(nums);
		for(int i=0;i<res;i++){
			System.out.println(nums[i]);
		}
			
	}
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
}
