package hw3;

import java.util.Scanner;

public class E52 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int ZERO = 0;
		
		//Asks user to enter an integer
		System.out.print("Enter an integer: ");
		int integer = in.nextInt();
		
		//Prints if the integer is 0, positive, or negative
		if (integer == ZERO) {
			System.out.println("The integer is " + ZERO + ".");
		}
		else if (integer > ZERO) {
			System.out.println("The integer is positive.");
		}
		else {
			System.out.println("The integer is negative.");
		}
		
		final int SMALL_THRESHOLD = 1;
		final int LARGE_THRESHOLD = 1000000;
		
		//Prints if the integer is small or large
		if (Math.abs(integer) < SMALL_THRESHOLD) {
			System.out.println("The integer is small.");
		}
		else if (Math.abs(integer) > LARGE_THRESHOLD) {
			System.out.println("The integer is large.");
		}
	}

}
