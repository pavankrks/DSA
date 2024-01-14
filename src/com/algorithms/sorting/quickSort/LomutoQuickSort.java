package com.algorithms.sorting.quickSort;

import java.util.Arrays;
import java.util.Scanner;

public class LomutoQuickSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		//when both crosses then the array must be sorted
		if(high>low) {
			
			//first do the partition and take the sorted value index
			int pivot = lomutoPartition(arr,low,high);
			
			//pass the index -1 to left as high
			//pass the index +1 to right as low
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
	}

	private static int lomutoPartition(int[] arr, int low, int high) {
		
		//here this is to keep track of smaller elements than pivot
		int i = low-1;
		
		//taking last element as pivot
		int pivot = arr[high];
		
		//this is to arrange the smaller elements in left area with the help of i
		for(int j = low;j<high;j++) {
			
			//when we encounter the smaller value , we have to swap the smaller
			//with largest
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		//finally we are placing the last element in its position
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
}
