package com.dataStructures.arrays.basic;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		
//		Enter Array Size: 5
//		Enter elements: 
//		5 12 -6 3 25
//		Largest Element is: 25
//		[5, 12, -6, 3, 25]
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Largest Element is: "+ largestElement(arr));
		scan.close();
	}

	private static int largestElement(int[] arr) {

		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		
		return max;
	}
}
