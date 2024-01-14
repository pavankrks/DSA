package com.algorithms.hashing.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HighestAndLowestFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter array size: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(maxMinFreq(arr)));
		scan.close();
	}

	private static int[] maxMinFreq(int[] v) {
		
		Map<Integer,Integer> map = new TreeMap<>();

        for(int i = 0;i<v.length;i++){

            map.put(v[i],map.getOrDefault(v[i], 0)+1);
        }

        Set<Integer> set = map.keySet();

        int maxC = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int max = 0;
        int min = 0;

        for(int i:set){

            if(maxC<map.get(i)){
                maxC = map.get(i);
                max = i;
            }

            if(minC>map.get(i)){
                minC = map.get(i);
                min = i;
            }
        }

        int[] arr = new int[2];

        arr[0] = max;
        arr[1] = min;

        return arr;
	}
}
