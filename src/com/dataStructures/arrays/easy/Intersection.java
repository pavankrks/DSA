package com.dataStructures.arrays.easy;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("first array: ");
		int n1 = scan.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("second array: ");
		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		scan.close();
	}
}
