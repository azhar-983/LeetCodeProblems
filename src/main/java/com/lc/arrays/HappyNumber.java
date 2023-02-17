package com.lc.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Azaruddin Sayyed
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, and repeat the process until the 
 * number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.

	Example: 
	
	Input: 19
	Output: true
	Explanation: 
	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1
 */
public class HappyNumber {

	public static void main(String[] args) {
		boolean res = isHappy(4);
		if(res)
			System.out.println("happy");
	}
	public static boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
	}		
	public static int getNext(int n)
	{
		int sum =0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum=sum+(digit*digit);
            
        }
        return sum;
    }
}
