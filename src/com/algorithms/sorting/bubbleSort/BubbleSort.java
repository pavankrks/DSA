package com.algorithms.sorting.bubbleSort;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		//calling the function
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void bubbleSort(int[] arr) {
		
		
		//this loop will act as outer count
		for(int i=0;i<arr.length-1;i++) {
			
			//this loop is to find the largest in the journey 
			//and place at the destination
			for(int j = 0;j<arr.length-i-1;j++) {
				
				//if we found previus element is greater than current 
				//then do swapping
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
}
