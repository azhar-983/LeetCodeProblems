package com.lc.arrays;

public class FirstNonRepeating {

	public static void main(String[] args) {

		char c = nonRepeatingChar("leetcode");
		System.out.println(c);
	}

	static char nonRepeatingChar(String s){
		int[] char_array = new int[26];
		for(int i=0; i<s.length(); i++){
			char_array[s.charAt(i)-'a']++;
		}

		for(int i=0; i<s.length(); i++){
			if(char_array[s.charAt(i)-'a']==1)
				return s.charAt(i);
		}
		return '@';
	}

}
