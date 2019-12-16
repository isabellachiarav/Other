package ch6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count = 2;
		boolean prime = true;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();
		
		while (count < n) {
			if (n % count == 0) {
				prime = false;
			}
			count++;
		}
		if (prime == true) {
			System.out.println("The number is prime.");
		}
		else {
			System.out.println("The number is not prime.");
		}

	}

}
