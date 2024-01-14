package com.dataStructures.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByDPlaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the rotations: ");
		int d = scan.nextInt();
		
		leftRotate(arr,d);
		System.out.println(Arrays.toString(arr));

		scan.close();
	}

	private static void leftRotate(int[] arr, int d) {

		d = d%arr.length;	
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		while(i<j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}
}
