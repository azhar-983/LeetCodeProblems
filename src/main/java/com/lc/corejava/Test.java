package com.lc.corejava;

import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        //int[] nums = new int[]{3,5,8,2,1,6,9,7,11,12};
        //System.out.println(getThirdLargest(nums));
        //IntStream is = Arrays.stream(nums).sorted().limit(3);
        //is.forEach(System.out::println);
        System.out.println(solution(3));
    }

    private static int solution(int n){
        if(n==1) return 1;
        int sum=Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            if(i%2==1)
                sum += i;
        }
        return ((int)Math.pow(2,n)-1)+sum*2;
    }
    private static int getThirdLargest(int[] nums) {
        int first=nums[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i=1; i<nums.length;i++ ){
            if(nums[i]>first){
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i]>second) {
                third = second;
                second = nums[i];
            } else if (nums[i]>third){
                third = nums[i];
            }
        }
        return second;
    }
}
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            int[] countArr = new int[26];
            for(char c:s.toCharArray()){
                countArr[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                sb.append(countArr[i]);
                sb.append("#");
            }

            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}