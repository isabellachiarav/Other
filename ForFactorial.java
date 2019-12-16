package ch5;

import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		
		int factorial = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = in.nextInt();
		
		for (int n = input; n > 0; n--) {
			factorial = factorial * n;
		}
		System.out.println("The factorial of " + input + " is " + factorial + ".");

	}

}
