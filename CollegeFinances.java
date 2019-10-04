import java.text.NumberFormat;
import java.util.Scanner;

public class CollegeFinances {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		NumberFormat fmt1 = NumberFormat.getPercentInstance();
		
//		double amount, loan, rate, month;
//		System.out.print("Input your monthly loan: ");
//		loan = scan.nextDouble();
//		System.out.print("Input your interest rate as a decimal: ");
//		rate = scan.nextDouble();
//		System.out.print("Input the number of months you will borrow for: ");
//		month = scan.nextDouble();
//		amount = ((loan * rate)/(1 - Math.pow((1 + rate), (-1 * month))) * month);
//		System.out.println("You will need " + fmt.format(amount) + " monthly.");
		
		double oneYear, percent = 0.2, twoYear, threeYear, fourYear, loan, amount, percentOfLoan, monthly;
		final double INFLATION = 0.029, INTEREST_RATE = 0.005, MONTHS = 120;
		System.out.print("Input the cost for the one year: ");
		oneYear = scan.nextDouble();
		
		twoYear = oneYear * (1 + INFLATION);
		threeYear = twoYear * (1 + INFLATION);
		fourYear = threeYear * (1 + INFLATION);
		loan = (oneYear + twoYear + threeYear + fourYear);
		System.out.println("For four years, you will need " + fmt.format(loan) + ".");
		
		while (percent <= 1) {
			amount = ((loan * INTEREST_RATE)/(1 - Math.pow((1 + INTEREST_RATE), (-1 * MONTHS))) * MONTHS);
			amount *= percent;
			percentOfLoan = loan * percent;
			monthly = amount / 120;
			System.out.println("For a " + fmt.format(percentOfLoan) + " loan (" + fmt1.format(percent) + " of the" +
			" four-year cost) at 6% interest with a payoff period of 12 years, you would pay a total of " + 
			fmt.format(amount) + ", which is a monthly payment of " + fmt.format(monthly) + ".");
			percent += 0.2;
			
		}
		
	

	}

}
