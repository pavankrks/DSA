package com.algorithms.sorting.countSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		countSort(arr,min(arr),max(arr));
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static int min(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int max(int[] arr) {
		
		int max =  Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		return max;
	}
	
	
	private static void countSort(int[] arr,int min, int max) {
		
		
		//we need min and max element of array so
		//we can build count array according to the requirements
		
		//the main advantage of taking min is
		//we can sort the negitive values as well
		
		//creating the count array
		int[] count = new int[(max - min)+1];
		
		
		//setting up of count array
		for(int i = 0;i<arr.length;i++) {
			
			count[arr[i] - min]++;
		}
		
		//updating count array to work with output array
		for(int i = 1;i<count.length;i++) {
			
			count[i] = count[i-1] + count[i];
		}
		
		
		
		//created temporary output array to store the values according 
		//to their frequencies
		int[] output = new int[arr.length];
		
		
		//storing the real values in output array in sorted format
		for(int i = arr.length-1;i>=0;i--) {
			
			output[--count[arr[i] - min]] = arr[i];
			
		}
		
		
		//finally copying the output values to original array
		for(int i = 0;i<arr.length;i++) {
			
			arr[i] = output[i];
		}
	}

}
