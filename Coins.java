import java.text.NumberFormat;
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		
		
		final double QUARTER = 0.25, DIME = 0.10, NICKEL = 0.05, PENNY = 0.01;
		double value, quarters, dimes, nickels, pennies;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of quarters: ");
		quarters = scan.nextDouble();
		System.out.print("Enter the number of dimes: ");
		dimes = scan.nextDouble();
		System.out.print("Enter the number of nickels: ");
		nickels = scan.nextDouble();
		System.out.print("Enter the number of pennies: ");
		pennies = scan.nextDouble();
		
		value = (quarters * QUARTER) + (dimes * DIME) + (nickels * NICKEL) + (pennies * PENNY);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Total: $" + value);
		
		
	}

}
