package com.lc.string;

public class ReverseString {

	public static void main(String[] args) {
		char[] c = {'h','e','l','l','O'};
		reverseString(c);
		System.out.println(c);
	}
	public static void reverseString(char[] s) {
		helper(0,s.length-1,s);
	}

	private static void helper(int start, int end, char[] s) {

		if(start<end){
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			helper(start+1,end-1,s);
		} else
			return;

	}
}