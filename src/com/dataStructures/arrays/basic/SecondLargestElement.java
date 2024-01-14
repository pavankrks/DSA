package com.dataStructures.arrays.basic;

import java.util.Scanner;

public class SecondLargestElement {
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

		System.out.println("Second Largest Element is: " + secondLargestElement(arr));
		scan.close();
	}

	private static int secondLargestElement(int[] arr) {

		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				
				//first storing the max into smallest
				//we dont have to lose the largest number until now
				sMax = max;
				
				//now store the largest
				max = arr[i];
			}
			
			//if we dont find max element
			//that's why we are using it find the secon largest
			else if(sMax<arr[i]) {
				sMax = arr[i];
			}
		}

		return sMax;
	}
}
