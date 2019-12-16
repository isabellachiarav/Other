package ch5;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the legal age in your country: ");
		int legalAge = in.nextInt();
		System.out.print("Insert your age: ");
		int myAge = in.nextInt();
		
		System.out.println("Your age is " + myAge + ".");
		
		if (myAge < legalAge) {
			System.out.println("Minority age");
		}
		else {
			System.out.println("Majority age");
		}
		
		
	}

}
