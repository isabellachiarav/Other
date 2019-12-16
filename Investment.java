package ch6;

public class Investment {

	public static void main(String[] args) {
		
		double initialBalance = 10000;
		final double RATE = 5;
		double targetBalance = 20000;
		
		double balance = initialBalance;
		int year = 0;
		
		while (balance < targetBalance) {
			year++;
			double interest = balance * RATE / 100;
			balance = balance + interest;
		}
		
		System.out.println("The initial investment doubled after " + year + " years.");

	}

}
