package com.lc.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Azaruddin Sayyed
 * Given a string, find the length of the longest substring without repeating characters.
 * Ex 1:
	Input: "abcabcbb"
	Output: 3 
	Explanation: The answer is "abc", with the length of 3.
 *  Ex 2:
 *  Input: "bbbbb"
	Output: 1
    Explanation: The answer is "b", with the length of 1.
	Ex 3:
	Input: "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3. 
    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubString {

	public static void main(String[] args) {
		int res = lengthOfLongestSubstring("abcabcbb");
		System.out.println(res);
	}
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    //Java (Assuming ASCII 128)
    //If we know that the charset is rather small, we can replace the Map with an integer array as direct access table.
    //Commonly used tables are:
    //int[26] for Letters 'a' - 'z' or 'A' - 'Z'
    //int[128] for ASCII
    //int[256] for Extended ASCII

   /* public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }*/
}
