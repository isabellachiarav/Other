package ch6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int count = 1, f1 = 1 , f2 = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer n to print the first n numbers of the Fibonacci series: ");
		int n = in.nextInt();
		
		System.out.print("First " + n + " terms: ");
		while (count <= n) {
			System.out.print(f1 + " ");
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			count++;
		}

	}

}
