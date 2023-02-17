package com.lc.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String input[] = {"flower","flow","flight"};
        String output = longestCommonPrefix(input);
        System.out.println(output);
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0)
                prefix = prefix.substring(0,prefix.length()-1);
        }

        return prefix;
    }
}
