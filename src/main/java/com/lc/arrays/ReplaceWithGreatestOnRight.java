package com.lc.arrays;

public class ReplaceWithGreatestOnRight {

	public static void main(String[] args) {
		int[] input = new int[]{17,18,5,4,6,1};
		int[] res = replaceElements(input);
		for(int i:res)
			System.out.println(i);

	}
	public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max=arr[len-1];
        arr[len-1] = -1;
        for(int i=len-2; i>=0; i--){
            
            if(max<arr[i]){
                
                max = arr[i];
            }
            arr[i] = max;
        }
        return arr;
    }
}
