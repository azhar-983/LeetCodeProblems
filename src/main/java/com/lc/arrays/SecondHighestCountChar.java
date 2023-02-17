package com.lc.arrays;

public class SecondHighestCountChar {
    public static void main(String[] args) {
        String s = "aaaaabbbbbbcccccccccdddddddddddddeefff";
        int max = getSecondHighChar(s);
        System.out.println(max);
    }
    private static int getSecondHighChar(String s) {
        int[] charArr = new int[26];
        for(int i=0;i<s.length(); i++){
            charArr[s.charAt(i)-'a']++;
        }
        int max=0,index=0;
        for(int j=0;j<charArr.length; j++){
            max = Math.max(max,charArr[j]);
        }
        return max;
    }
}
