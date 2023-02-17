package com.lc.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int d = 3;
		rotateLeft(a,d);
		//rotateRight(a,d);
		printArray(a);
	}

	private static void printArray(int[] a) {
		for(int i:a){
			System.out.println(i);
		}
	}

	private static void rotateRight(int[] a, int d) {
		
	}

	private static void rotateLeft(int[] a, int d) {
		if(d==0)
			return;
		int n = a.length;
		rotateArray(a,0,d-1);
		rotateArray(a,d,n-1);
		rotateArray(a,0,n-1);
	}

	private static void rotateArray(int[] a, int start, int end) {
		int temp;
		while(start<end){
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

}
