package com.algorithms.sorting.mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

//		Enter array size: 5
//		5 1 9 3 2
//		[1, 2, 3, 5, 9]

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		// calling merge function
		mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void mergeSort(int[] arr, int low, int high) {

		// if they cross each other then the result will be an sorted array
		if (high > low) {

			// this will help to sperate the array into two parts
			int mid = (low + high) / 2;

			// merging the left part
			mergeSort(arr, low, mid);
			// merging the right part
			mergeSort(arr, mid + 1, high);

			// finally merging the left and right parts
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		// here we are creating two temporary arrays
		// in order to store the left and right parts of original array

		int[] left = new int[mid - low + 1];// only mid is used so add one
		int[] right = new int[high - mid];// mid+1 so won't need to add one

		// copying the left part
		for (int i = 0; i < left.length; i++) {

			left[i] = arr[low + i];
		}

		// copying the right half
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[mid + 1 + i];
		}

		// i for left
		// j for right
		// k for merging
		int i = 0;
		int j = 0;
		int k = low;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {

				arr[k++] = left[i++];
			}

			else {
				arr[k++] = right[j++];
			}
		}

		// copying the reamining left array elements
		while (i < left.length) {
			arr[k++] = left[i++];
		}

		// copying the remaining right array elements

		while (j < right.length) {
			arr[k++] = right[j++];
		}

	}
}
