package hw3;

import java.util.Scanner;

public class E51 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Asks user to enter an integer
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
		
	}

}
