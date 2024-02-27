package com.dataStructures.hashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class RepeatingLargestAndSmallest {

	public static void main(String[] args) {
		
		//
		//1,3,6,2,1,3,6,3,6
		int[] arr = {11, 13 ,3, 14,7 ,9, 1 ,11 ,11,9, 15, 5 ,2, 2,15,15, 3, 17};
		
		int[] result = find(arr);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] find(int[] arr) {

		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int small = Integer.MAX_VALUE;
		int large = Integer.MAX_VALUE;
		Set<Integer> set = map.keySet();
		for(int k:set) {
		
				if(max<map.get(k)) {
					max = map.get(k);
					large = k;
				}
				else if(max==map.get(k)) {
					
					if(large>k) {
						large = k;
					}
				}
				
			
				if(min>map.get(k)) {
					min = map.get(k);
					small = k;
				}
				else if(min==map.get(k)) {
					if(small>k) {
						small = k;
					}
				}
				
		
			
		}
		
		int[] result = {small,large};
		return result;
	}
}
