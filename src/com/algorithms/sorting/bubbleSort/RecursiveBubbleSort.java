package com.algorithms.sorting.bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
	
	public static void main(String[] args) {
		
//		Enter Array Size: 5
//		Enter elements: 
//		5 4 3 2 1
//		[1, 2, 3, 4, 5]

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		bubbleSort(arr,0);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void bubbleSort(int[] arr,int i) {
		
		//thi is for outline
		if(i<arr.length-1) {
			
			//we need to reset the j
			//every time we call bubble function from bubbleSort
			int j = 0;
			//this is place the largest element in current last
			bubbleFunction(arr,i,j);
			//this is for calling new bubble function
			bubbleSort(arr,i+1);
		}
	}

	private static void bubbleFunction(int[] arr, int i, int j) {
		
		//this is to make sure we don't do extra operations
		if(j<arr.length-1 - i) {
			
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
			//we have to call this until above condition fails
			bubbleFunction(arr,i,j+1);
		}
	}
}
