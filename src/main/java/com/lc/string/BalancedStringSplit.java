package com.lc.string;

/**
 * 
 * @author Azaruddin Sayyed
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
   Given a balanced string s split it in the maximum amount of balanced strings.
   Return the maximum amount of splitted balanced strings.

	Example 1:
	
	Input: s = "RLRRLLRLRL"
	Output: 4
	Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number 
	of 'L' and 'R'.
 */
public class BalancedStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int balancedStringSplit(String s) {
        int splitString = 0;

        int rCounter = 0;
        int lCounter = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                rCounter++;
            else if (s.charAt(i) == 'L')
                lCounter++;

            if (rCounter == lCounter)
                splitString++;

        }

        return splitString;
    }
}
