package com.lc.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        boolean res = isAnagram("Abul","BulA");
        System.out.println(res);
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
        else if(a.equalsIgnoreCase(b))
            return true;
        else{
            Map<Character,Integer> count = new HashMap<>();
            String a1 = a.toLowerCase();
            String b1 = b.toLowerCase();
            for(int i=0;i<a.length(); i++){
                count.put(a1.charAt(i),count.getOrDefault(a1.charAt(i),0)+1);
                count.put(b1.charAt(i),count.getOrDefault(b1.charAt(i),0)-1);
            }

            for(char c:count.keySet()){
                if(count.get(c) != 0)
                    return false;
            }
            return true;
        }
    }
}
