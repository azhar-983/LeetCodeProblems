package com.lc.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Azaruddin Sayyed
 * Given a string containing digits from 2-9 inclusive, return all possible letter 
 * combinations that the number could represent. A mapping of digit to letters 
 * (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationPhoneNumber {

	public static void main(String[] args) {
		List<String> combList = letterCombinations("34");
		System.out.println(combList.toString());
	}
	public static List<String> letterCombinations(String digits) {
		String[] arr = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	    if(digits.equals(""))
	        return new ArrayList<String>();
	    StringBuilder sb = new StringBuilder();
	    List<String> finalList = new ArrayList<String>();
	    helper(finalList,digits,sb,0,arr);
	    return finalList;
}

public static void helper( List<String> finalList, String digits,StringBuilder sb, int index,String[] arr)
{ 
    if(digits.length() == sb.length())
    {
        finalList.add(String.valueOf(sb));
    }else{
         for(int j = 0; j < arr[digits.charAt(index) - '0'].length();j++){
            sb.append(arr[digits.charAt(index) - '0'].charAt(j));
            helper(finalList,digits,sb,index+1,arr);
            sb.deleteCharAt(sb.length()-1);
         }
    }
}
}
