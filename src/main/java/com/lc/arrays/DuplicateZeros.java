package com.lc.arrays;

/**
 * 
 * @author asayyed
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, 
 * shifting the remaining elements to the right.
 * Note : that elements beyond the length of the original array are not written. 
 * Do the above modifications to the input array in place and do not return anything.
 */
public class DuplicateZeros {

	public static void main(String[] args) {
		int[] arr = new int[]{1,0,2,3,0,0,5,0};
		duplicateZeros(arr);
		for(int i:arr)
		System.out.println(i);
	}
	public static void duplicateZeros(int[] arr) {
        int length = arr.length-1;
        int possibleDups = 0;
        
        for(int i=0; i<=length-possibleDups; i++) {
        	if(arr[i]==0) {
        		//Edge case
        		if(i == length-possibleDups) {
        			arr[length]=0;
        			length -= 1;
        			break;
        		}
        		possibleDups++;
        	}
        }
        int last = length-possibleDups;
        for(int j=last; j>0; j--) {
        	if(arr[j]==0) {
        		arr[j+possibleDups]=0;
        		possibleDups--;
        		arr[j+possibleDups]=0;
        	}else {
        		arr[j+possibleDups]=arr[j];
        	}
        }
        
    }
}
