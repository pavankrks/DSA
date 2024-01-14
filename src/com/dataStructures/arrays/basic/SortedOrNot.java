package com.dataStructures.arrays.basic;

import java.util.Scanner;

public class SortedOrNot {

		public static void main(String[] args) {
			
			
//			Enter Array Size: 5
//			Enter elements: 
//			5 4 3 2 1
//			Result: false
			
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Array Size: ");
			int n = scan.nextInt();
			System.out.println("Enter elements: ");
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.println("Result: "+ sortedOrNot(arr));
			scan.close();
		}

		private static boolean sortedOrNot(int[] arr) {

			for(int i = 0;i<arr.length-1;i++) {
				
				if(arr[i]>arr[i+1]) {
					return false;
				}
			}
			
			
			return true;
		}
}
