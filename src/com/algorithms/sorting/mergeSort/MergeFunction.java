package com.algorithms.sorting.mergeSort;
import java.util.Arrays;
import java.util.Scanner;
public class MergeFunction {
	
	public static void main(String[] args) {
		
		/*
		 * Enter first array size: 5
		 * 1 2 3 4 5 
		 * Enter second array size: 2
		 * -1 -1
		 * [-1, -1, 1, 2, 3, 4, 5]
		 */

		Scanner scan = new Scanner(System.in);
		
		//first array input
		System.out.print("Enter first array size: ");
		int n1 = scan.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		//second array input
		System.out.print("Enter second array size: ");
		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		
		//storing the merged array in result array
		int[] res = mergeFunction(arr1,arr2);
		
		System.out.println(Arrays.toString(res));
		scan.close();
	}

	private static int[] mergeFunction(int[] arr1, int[] arr2) {
		
		//length of both arrays for convenience purpose
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		//creating array in order to store the values of two arrays
		//size is equal to sum of both array sizes
		int[] res = new int[n1+n2];
		
		//i for first array
		//j for second array
		//k for resultant array
		int i = 0;
		int j = 0;
		int k = 0;
		
		
		//merge function begins
		while(i<n1 && j<n2) {
			
			if(arr1[i]<=arr2[j]) {
				res[k++] = arr1[i++];
			}
			
			else {
				res[k++] = arr2[j++];
			}
		}
		
		
		//first array remaining elements
		while(i<n1) {
			res[k++] = arr1[i++];
		}
		
		
		//second array remaining elements
		while(j<n2) {
			res[k++] = arr2[j++];
		}
		
		
		//returning the merged array
		return res;
	}
}
