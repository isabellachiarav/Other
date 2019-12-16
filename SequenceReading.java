package ch5;

import java.util.Scanner;

public class SequenceReading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = null;

		System.out.println("Enter a sequence of words (type 'STOP' to end): ");

		int count = 0;
		boolean stop = false;

		do {
			s = sc.next();
			if (s.equals("STOP")) {
				stop = true;;
			}
			else {
				count++;
			}
		} while(!stop);

		System.out.println("Number of inputs: " + count);

	}

}
