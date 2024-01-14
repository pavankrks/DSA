package com.dataStructures.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		
		System.out.println("upto : "+ removeDuplicates(arr)+" sorted");
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static int removeDuplicates(int[] arr) {

		//this is to keep track of insert index
		int index = 0;
		for(int i = 0;i<arr.length-1;i++) {
			
			//if we encounter we have update the i value 
			// to the index location and increment the index
			//for next operation
			if(arr[i]!=arr[i+1]) {
				arr[index++] = arr[i];
			}
		}
		
		
		//this is to store the last element
		arr[index++] = arr[arr.length-1];
		
		return index;
	}
}
