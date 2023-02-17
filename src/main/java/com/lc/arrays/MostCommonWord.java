package com.lc.arrays;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String para = "Smile, smile, smile at your mind as often as possible.\n";
        String[] banned = {"YOUR","MIND","POSSIBLE"};
        String res = mostCommonWord(para,banned);
        System.out.println(res);
    }
    public static String mostCommonWord(String paragraph, String[] banned){

        Map<String,Integer> map = new HashMap<>();
        Set<String> bWords = new HashSet<>();
            for(String bWord:banned)
            bWords.add(bWord);

        for(String word : paragraph.replaceAll("[^a-zA-Z]"," ").toUpperCase().split("\\s")){
        if(!bWords.contains(word))
            map.put(word,map.getOrDefault(word,0)+1);
        }
        String res = "";
        for(String s : map.keySet()){
            if(res.equals("") || map.get(s) > map.get(res))
                res = s;
         }
        return res;

    }
}
