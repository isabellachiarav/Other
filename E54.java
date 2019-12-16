package ch5;

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double n1 = in.nextDouble();
		System.out.print("Enter the second number: ");
		double n2 = in.nextDouble();
		System.out.print("Enter the third number: ");
		double n3 = in.nextDouble();
		if (n1 == n2 && n2 == n3) {
			System.out.println("All the same.");
		}
		else if (n1 != n2 && n2 != n3) {
			System.out.println("All different.");
		}
		else {
			System.out.println("Neither.");
		}
		

	}//main

}//E54 class
