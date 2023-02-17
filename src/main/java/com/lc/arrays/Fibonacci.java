package com.lc.arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 17;
		int[] memo = new int[n+1];
		/*for(int i=1;i<=n; i++)
			System.out.println(fib(i,memo));*/
		//System.out.println(powersOf2(6));
		//System.out.println(powerOfX(4,6));
		System.out.println(Modulo(7,8));
		System.out.println(isUnique("azhr"));
	}
	static int fib(int n, int[] memo) 
	{
		if (n <= 0) return 0;
		else if (n == 1) return 1;
		else if (memo[n]<0) return memo[n];
		memo[n] = fib(n - 1,memo) + fib(n - 2,memo);
		return memo[n];
		}
	static int powersOf2(int n) 
	{
		if (n < 1) {
			return 0;
		} 
		else if (n == 1) {
			System.out.println(1);
			return 1;
		}
		else {
			int prev = powersOf2(n / 2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
	static int powerOfX(int m, int n) 
	{
		if (n < 0) {
			return 0;
		} 
		else if (n == 0) {
			return 1;
		}
		else{
			return m*powerOfX(m,n-1);
		}
	}
	static int Modulo(int m, int n) 
	{
		if (n<=0) {
			return -1;
		} 
		int div = m/n;
		return m-div*n;
	}
	static boolean isUnique(String text)
	{
		int checker = 0;
		for (int i = 0; i < text.length(); i++) {
		int val = text.charAt(i) - 'a';
		if ((checker & (1 << val)) >0) 
		{
			return false;
		}
		checker |= (1 << val);
		}
		return true;
	}
}
