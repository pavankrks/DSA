package com.algorithms.sorting.insertionSort;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		scan.close();
	}

	private static void insertionSort(int[] arr) {
		
		
		//insertion sort is to sort the people according
		//to the height whenever new people came to join the 
		//queue
		
		
		//outer loop acts as counter
		for(int i = 0;i<arr.length-1;i++) {
			
			//this loop will adjust the people according to the height
			//from the current last
			for(int j = i+1;j>0;j--) {
				
				//if the previous person is low then current
				//no need for swapping
				if(arr[j-1]<arr[j]) {
					break;
				}
				
				//we need to swap until we find previous smaller person
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
