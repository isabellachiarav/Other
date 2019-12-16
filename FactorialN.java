package ch6;

import java.util.Scanner;

public class FactorialN {

	public static void main(String[] args) {
		
		int factorial = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();
		
		while (n > 0) {
			factorial = factorial * n;
			n--;
		}
		System.out.println("The factorial is " + factorial + ".");

	}

}
