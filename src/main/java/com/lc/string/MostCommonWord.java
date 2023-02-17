package com.lc.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

	public static void main(String[] args) {

	}
    public String mostCommonWord(String paragraph, String[] banned) {
    	//Construct a hashset with list of banned words
    	Set<String> bWords = new HashSet<>();
    	for(String bWord:banned)
    		bWords.add(bWord);
    	
    	Map<String,Integer> counts = new HashMap<>();
    	for(String word:paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ")) {
    		if(!bWords.contains(word))
    			counts.put(word, counts.getOrDefault(word, 0)+1);
    	}
    	String result="";
    	for(String key:counts.keySet()) {
    		if(result.equals("") || counts.get(key) > counts.get(result))
    			result = key;
    	}
    	return result;
    }
}
