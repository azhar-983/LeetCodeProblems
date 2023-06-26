package com.lc.arrays;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 */
public class TrapRainWater {
    public static void main(String[] args) {
        int[] input = new int[]{4,2,0,3,2,5};
        System.out.println(trap(input));
    }
    public static int trap(int[] height) {
        int water = 0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        left[0] = height[0];
        for(int i=1; i<height.length; i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        right[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        for(int i=0; i<height.length;i++){
            water += Math.min(left[i],right[i])-height[i];
        }
        return water;

    }
}
