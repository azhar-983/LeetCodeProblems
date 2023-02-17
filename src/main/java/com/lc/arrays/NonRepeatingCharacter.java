package com.lc.arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(findFirst("xxyyzz"));
    }
    public static char findFirst(String input)
    {
        /*Map<Character, Integer> map = new HashMap<>();
        for(char c:input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:input.toCharArray())
        {
            if(map.get(c)==1)
                return c;
        }
        return (0);*/

        if(input.length()<1) return (0);
        int[] char_array = new int[26];
        for(char c:input.toCharArray()){
            char_array[c-'a']++;
        }
        for(int i=0; i<input.length(); i++){
            if(char_array[input.charAt(i)-'a']==1)
                return input.charAt(i);
        }

        return(0);
    }

}
