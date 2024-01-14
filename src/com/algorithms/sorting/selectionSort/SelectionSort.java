package com.algorithms.sorting.selectionSort;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void selectionSort(int[] arr) {
		
		//this works based on finding minimum element or maximum element
		//we are finding min to sort the array
		
		//this is to store the minimum element element index
		int min = 0;
		
		//this loop will help to find the minimum element index
		for(int i = 0;i<arr.length-1;i++) {
			
			min = i;
			
			for(int j = i;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			
			
			//finally we are swapping the min element index
			//with the current index
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}
}
