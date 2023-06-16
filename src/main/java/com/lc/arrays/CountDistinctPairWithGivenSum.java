package com.lc.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 Given an array arr[] of size N and an integer K, the task is to find the count of
 distinct pairs in the array whose sum is equal to K.
*/
public class CountDistinctPairWithGivenSum {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7,8,9,1};
        int res = getCountOfDistinctPairs(input,10);
        System.out.println(res);
    }

    private static int getCountOfDistinctPairs(int[] input, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> key = new HashSet<>();
        Set<Integer> value = new HashSet<>();
        //{1,2,3,4,5,6,7,8,9,1};
        //key - 1--9
        //value -
        int result=0;
        for(int i:input){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int i = m.getKey();
            if(2*i==k) {
                if (map.get(i) > 1) {
                    result += 2;
                    System.out.println(i+"  "+i);
                }
            }
            else {
                if(map.containsKey(k-i)){
                    result++;
                    System.out.println(i +"  "+(k-i));
                }
            }
        }
        return result;
    }
}
