package com.algorithms.sorting.radixSort;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		radixSort(arr,max(arr));

		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static int max(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {

				max = arr[i];
			}
		}
		return max;
	}

	private static void countSort(int[] arr,int exp) {

		
		//we created the 10 sized count array
		//there are numbers from 0 - 9
		//that's why
		int[] count = new int[10];

		
		//setting up count array
		for (int i = 0; i < arr.length; i++) {
			
			//this will decide the place value
			int value = (arr[i]/exp)%10;

			count[value]++;
		}

		
		//updating count array for final operation
		for (int i = 1; i < count.length; i++) {

			count[i] = count[i - 1] + count[i];
		}

		
		//created output array to store the values in sorted manner
		int[] output = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			
			int value = (arr[i]/exp)%10;

			//updating the value according to the frequency
			output[--count[value]] = arr[i];

		}

		//finally copying the array values
		for (int i = 0; i < arr.length; i++) {

			arr[i] = output[i];
		}
	}
	
	private static void radixSort(int[] arr,int max) {
		
		//we are using the place value sorting,
		//so we can create only 10 sized count array
		
		for(int exp = 1; (max/exp)>0;exp = exp*10) {
			
			//passing the exponent to sort the values according 
			//to place value
			countSort(arr,exp);
		}
		
	}
}
