package com.lc.corejava;

import java.util.*;

public class RemoveAnagrams {
    public static void main(String[] args) {
        String[] input = new String[]{"abba","cd","baba","bbaa","cd"};
        List<String> list = removeAnagrams(input);
        System.out.println(list);
    }
    public static List<String> removeAnagrams(String[] words) {
        /*List<String> result;
        Map<String, String> mapping = new HashMap<>();
        for(String word : words){
            int[] char_array = new int[26];
            for(char c : word.toCharArray()){
                char_array[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(char_array[i]);
            }

            String key = sb.toString();
            if(!mapping.containsKey(key))
                mapping.put(key,word);
        }
        result = new ArrayList<>(mapping.values());
        return result;*/

        String prev ="";
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            if(!curr.equals(prev)){
                li.add(words[i]);
                prev=curr;
            }
        }
        return li;
    }
}
