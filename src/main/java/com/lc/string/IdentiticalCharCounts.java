package com.lc.string;

public class IdentiticalCharCounts {

	public static void main(String[] args) {
		boolean res = permutation("ttazharxx","xxazhartt");
		System.out.println(res);
	}
	static boolean permutation(String s, String t){
		if(s.length() != t.length())
			return false;
		int [] letters = new int[128];
		char[] c = s.toCharArray();
		char[] d = t.toCharArray();
		for(char c1:c){
			letters[c1]++;
		}
		for(int i=0;i<t.length();i++){
			int a = (int)t.charAt(i);
			letters[a]--;
			if(letters[a]<0)
				return false;
		}
		return true;
	}

}
