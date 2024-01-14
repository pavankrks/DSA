package com.dataStructures.arrays.basic;

import java.util.Scanner;

public class RotatedOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("result: "+rotatedOrNot(arr));
		scan.close();
	}

	private static boolean rotatedOrNot(int[] arr) {

		//this is to store the violation count
		int k = 0;
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>arr[(i+1)%arr.length]) {
				k++;
			}
			
			//if it violates more than 1 time, then the array is not rotated
			if(k>1) {
				return false;
			}
		}
		
		return true;
	}
}
