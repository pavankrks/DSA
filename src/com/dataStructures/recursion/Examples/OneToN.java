package com.dataStructures.recursion.Examples;

import java.util.Scanner;

public class OneToN {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = scan.nextInt();
		
		oneToN(n);
		
		scan.close();
		
	}

	private static void oneToN(int n) {
		
		//base condition
		if(n==1) {
			
			System.out.println(1);
			return;
		}
		
		//recursive call : calling itself
		oneToN(n-1);
		System.out.println(n);
		
	}
}
