package com.lc.string;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end
 * of the merged string.
 *
 * Return the merged string.
 */
public class MergeStringsAlternate {
    public static void main(String[] args) {

        String result = mergeAlternately("abcd","pq");
        System.out.println(result);
    }
    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int N = Math.min(len1,len2);

        StringBuilder result= new StringBuilder();
        for(int i=0; i<N; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(len1>len2)
            result.append(word1.substring(N));
        else if(len1<len2)
            result.append(word2.substring(N));

        return result.toString();
    }
}
