package com.lc.arrays;

/**
 * 
 * @author asayyed
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * Ex n= 3 count = 5
 * Actually, as it turns out, the sequence of G(n) function results is known as Catalan number 
 * And one of the more convenient forms for calculation is defined as follows:
 * Cn+1 = C * 2*(2n+1)/n+2
 */
public class UniqueBSTCount {

	public static void main(String[] args) {
		int res = numTrees(10);
		System.out.println(res);

	}
	public static int numTrees(int n) {
        long C = 1;
        for (int i = 0; i < n; ++i) {
          C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}
