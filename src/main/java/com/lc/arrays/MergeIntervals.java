package com.lc.arrays;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i[]:intervals){

        }
        return null;
    }
}
