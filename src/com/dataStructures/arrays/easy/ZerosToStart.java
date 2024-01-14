package com.dataStructures.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosToStart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		zeroesToFirst(arr);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	private static void zeroesToFirst(int[] arr) {

		
		//keep track of non zero elements inserting index
		//from last 
		int curr = arr.length-1;
		for(int i = arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[curr];
				arr[curr] = temp;
				curr--;
			}
		}
	}

}
