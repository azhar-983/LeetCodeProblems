package com.lc.arrays;

/**
 * 
 * @author asayyed
 * The Hamming distance between two integers is the number of positions at which the 
 * corresponding bits are different. Given two integers x and y, calculate the Hamming distance.
 * Note:
	0 ≤ x, y <pow(2,31)
 */
public class Hammingdistance {

	public static void main(String[] args) {
		int res = hammingDistance(4, 1);
		System.out.println(res);
	}
	//using Java API
	/*public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y); 
    }*/
	//Bit Shift
	/*public int hammingDistance(int x, int y) {
		    int xor = x ^ y;
		    int distance = 0;
		    while (xor != 0) {
		      if (xor % 2 == 1)
		        distance += 1;
		      xor = xor >> 1;
		    }
		    return distance;
	}*/
	public static int hammingDistance(int x, int y) {
        int xor = x^y;
        int distance=0;
        while(xor!=0){
            distance++;
            xor=xor&(xor-1);
        }
        return distance;
    }
}
