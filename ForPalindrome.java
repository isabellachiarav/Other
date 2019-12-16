package ch5;

import java.util.Scanner;

public class ForPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string and I will check if it is a palindrome: ");
		
		String s = sc.nextLine();
		
		int l = s.length();
		
		boolean isPalindrome = true;
		
		for (int i = 0; i <= l - 1; i++) {
			char ci = s.charAt(i);
			int j = l - 1 - i;
			char cj = s.charAt(j);
			
			if (ci != cj) {
				isPalindrome = false;
			}
		}
		
		if (isPalindrome == true)
			System.out.println("The string " + s + " is a palindrome.");
		else
			System.out.println("The string " + s + " is not a palindrome.");
		
		

	}

}
