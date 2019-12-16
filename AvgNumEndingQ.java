package ch5;

import java.util.Scanner;

public class AvgNumEndingQ {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter integer values, ending with 'Q': ");
		
		int sum = 0, count = 0;
		
		while (in.hasNextInt()) {
			int x = in.nextInt();
			sum += x;
			count++;
		}
		
		double avg = (double)sum / count;
		
		System.out.println("Average: " + avg);

	}

}
