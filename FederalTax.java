package ch5;

import java.util.Scanner;

public class FederalTax {

	public static void main(String[] args) {
		
		final double SINGLE_INCOME = 32000;
		final double MARRIED_INCOME = 64000;
		final double TAX_LOWER = .10;
		final double TAX_UPPER = .25;
		final double THRESHOLD_SINGLE = 3200;
		final double THRESHOLD_MARRIAGE = 6400;
		double tax = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter marital status (S or M): ");
		String status = in.next();
		System.out.print("Enter income: ");
		double income = in.nextInt();
		
		if (status.equals("S")) {
			if (income <= SINGLE_INCOME) {
				tax = TAX_LOWER * income;
			}
			else {
				tax = THRESHOLD_SINGLE + TAX_UPPER * (income - SINGLE_INCOME);
			}
		}
		else if (status.equals("M")) {
			if (income <= MARRIED_INCOME) {
				tax = TAX_LOWER * income;
			}
			else {
				tax = THRESHOLD_MARRIAGE + TAX_UPPER * (income - MARRIED_INCOME);
			}
		}
		
		System.out.println("The tax to be paid is $" + tax);

	}

}
