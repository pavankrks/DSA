//>> Here i used the technique of memoization
//this will help full to overcome the problem of repetitiveness





package com.dataStructures.recursion.problems;

import java.util.Scanner;

public class NthFibonacci {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n = scan.nextInt();
		
		int  res = nthFibo(n);
		
		System.out.println(res);
		
		scan.close();
	}

	private static int nthFibo(int n) {
		if (n == 0) return 0;
		int prev = 0,  next = 0, curr = 1;
		for (int i = 1; i < n; i++) {
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		return curr;     
	}
}
