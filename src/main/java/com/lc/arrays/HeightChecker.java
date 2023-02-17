package com.lc.arrays;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] input = new int[] {5,1,2,3,4};
		int res = heightChecker(input);
		System.out.println(res);
	}
	public static int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        int count=0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] == sortedHeights[i])
                count++;
        }
        return count;
    }
}
