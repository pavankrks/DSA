package com.algorithms.sorting.quickSort;

import java.util.Arrays;
import java.util.Scanner;

public class HoareQuickSort {

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
		
		//if both crosses then the resultant array is sorted
	    if (low < high) {
	    	
	    	//first doing the partition and find the pivot element
	        int pivot = hoarePartition(arr, low, high);
	        
	        //based on pivot element we pass the left and right partition values
	        quickSort(arr, low, pivot);
	        quickSort(arr, pivot + 1, high);
	    }
	}

	private static int hoarePartition(int[] arr, int low, int high) {
		
		//we took first element as pivot
	    int pivot = arr[low];
	    
	    //from left side
	    int i = low - 1;
	    
	    //from right side
	    int j = high + 1;

	    while (true) {
	        do {
	            i++;
	        } while (arr[i] < pivot);//need to find greater element index

	        do {
	            j--;
	        } while (arr[j] > pivot);//need to find smaller element index

	        //if both are crossed we can return the j index
	        if (i >= j) {
	            return j;
	        }

	        //swapping the largest and smallest elements in to their sections
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}
}
