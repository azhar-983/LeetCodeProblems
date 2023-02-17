package com.lc.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7};
		reverse(A);
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
	}
	public static void reverse(int[] array)
	{
		for (int i = 0; i < array.length / 2; i++) {
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}
}

