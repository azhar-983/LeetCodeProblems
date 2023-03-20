package com.lc.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] char_array = new int[26];
            for(int i=0; i<str.length(); i++){
                char_array[str.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(char_array[i]);
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}