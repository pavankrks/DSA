package com.problems.striver.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = fact(n);
		System.out.println(result);
	}

	private static int fact(int n) {

		if(n==1 || n==0) {
			return 1;
		}
		
		return n*fact(n-1);
	}
}
