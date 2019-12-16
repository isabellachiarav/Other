package ch5;

import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		
		int f1 = 1 , f2 = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer n to print the first n numbers of the Fibonacci series: ");
		int n = in.nextInt();
		
		System.out.print("First " + n + " terms: ");
		for (int count = 1; count <= n; count++) {
			System.out.print(f1 + " ");
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}

	}

}
