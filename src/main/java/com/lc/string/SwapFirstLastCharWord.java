package com.lc.string;

/**
 * 
 * @author Azaruddin Sayyed
 *
 */
public class SwapFirstLastCharWord {

	public static void main(String[] args) {
		String res = swapChars("lets try this ");
		System.out.println(res);
	}
	public static String swapChars(String s){
		char[] charArr = s.toCharArray();
		int n = charArr.length;
		for(int i=0;i<n;i++)
		{
			int k=i;
			//we have to check i<n as there wont be space in the end of string 
			while(i<n&&charArr[i] != ' ')
				i++;
			char temp = charArr[k];
			charArr[k] = charArr[i-1];
			charArr[i-1] = temp;
		}
		return new String(charArr);
	}
}
