package com.algorithms.sorting.insertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		insertionSort(arr,0);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	
private static void insertionSort(int[] arr,int i) {
		
	//this is for outline
		if(i<arr.length-1) {
			
			
			//update the j whenever we call insertion funtction
			//from insertion sort function
			int j = i+1;
			
			//this will sort the begining elements
			insertionFunction(arr,j);
			
			//this is to call the insertion function again
			insertionSort(arr,i+1);
		}
	}

	private static void insertionFunction(int[] arr,int j) {
		
	
		//this is make sure we wont need to go to first index
		if(j>0) {
			
			//if we encounter this condition
			//there is no meaning for doing the further operations
			if(arr[j-1]<arr[j]) {
				return;
			}
			
			//swap until the above condition become true
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			
			//this will be called until the first and second
			//condition becomes true
			insertionFunction(arr,j-1);
		}
	}
}
