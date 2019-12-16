package ch5;

import java.util.Scanner;

public class WhileSequenceReading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = null;

		System.out.println("Enter a sequence of words (type 'STOP' to end): ");

		int count = 0;
		boolean stop = false;

		while (!stop) {
			s = sc.next();
			if (s.equals("STOP")) {
				stop = true;;
			}
			else {
				count++;
			}
		}

		System.out.println("Number of inputs: " + count);

	}

}
