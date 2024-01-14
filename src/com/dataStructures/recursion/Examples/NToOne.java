package com.dataStructures.recursion.Examples;

import java.util.Scanner;

public class NToOne {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = scan.nextInt();
		
		nToOne(n);
		
		scan.close();
		
	}

	private static void nToOne(int n) {
		
		//base condition
		if(n==1) {
			
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		//recursive call : calling itself
		nToOne(n-1);
		
	}
}
