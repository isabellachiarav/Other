package hw3;

import java.util.Scanner;

public class E52 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Asks the user to enter an integer
		System.out.print("Enter an integer: ");
		int integer = in.nextInt();
		
		
		//Prints if the integer is 0, positive, or negative
		if (integer == 0) {
			System.out.println("The integer is 0.");
		}
		else if (integer > 0) {
			System.out.println("The integer is positive.");
		}
		else {
			System.out.println("The integer is negative.");
		}
		
		//Prints if the integer is small or large
		if (Math.abs(integer) < 1) {
			System.out.println("The integer is small.");
		}
		else if (Math.abs(integer) > 1000000) {
			System.out.println("The integer is large.");
		}
	}

}
