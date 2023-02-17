package com.lc.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author asayyed
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
For example, two is written as II in Roman numeral, just two one's added together. 
Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, 
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral 
for four is not IIII. Instead, the number four is written as IV. Because the one is before the 
five we subtract it making four. The same principle applies to the number nine, which is written as 
IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range 
from 1 to 3999.
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int romanToInt(String s) 
    {
        Map<Character,Integer> hash = new HashMap<Character,Integer>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int sum =0;
        char[] chr = s.toCharArray();
        for(int i=0;i<chr.length;i++)
        {
           if(i+1<chr.length){
              if(hash.get(chr[i])<hash.get(chr[i+1]))
              {
                 sum += hash.get(chr[i+1]) - hash.get(chr[i]);
                 i++;
                 continue;
              }
            }
            sum += hash.get(chr[i]);  
        }
        return sum;
    }
}
