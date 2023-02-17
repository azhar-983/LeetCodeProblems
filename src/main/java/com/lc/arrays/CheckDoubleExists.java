package com.lc.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckDoubleExists {

	public static void main(String[] args) {

		int[] arr = new int[] {3,1,7,11};
		boolean res = checkIfExist(arr);
		System.out.println(res);
	}
	public static boolean checkIfExist(int[] arr) {
		Map<Integer,Integer> m = new HashMap<>();
	    for(int i=0; i<arr.length; i++){
	    	if(m.containsValue(2*arr[i]) || (arr[i]%2 == 0 && m.containsValue(arr[i]/2)))
	    		return true;
	        m.put(i,arr[i]);
	        }
	        return false;
	    }
}
