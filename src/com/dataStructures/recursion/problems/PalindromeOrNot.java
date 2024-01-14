package com.dataStructures.recursion.problems;

import java.util.Scanner;

public class PalindromeOrNot {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string: ");
		String s = scan.nextLine();
		
		if(isPalindrome(s,0)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		//closing the scanner
		scan.close();
		
	}
	
	private static boolean isPalindrome(String s, int i) {
		
		//if i exceeds half length of string then it is palindrome
		if(i>=s.length()/2) {
			return true;
		}
		
		//if we encounter mismatch we can make sure it is not palindrome
		else if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			return false;
		}
		
		
		//recursive function call
		return isPalindrome(s, i+1);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
