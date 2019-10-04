import java.text.DecimalFormat;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		double fahrenheit, celsius;
		System.out.print("Enter degrees in Fahrenheit: ");
		fahrenheit = scan.nextDouble();
		celsius = ((fahrenheit - 32) * (5.0 / 9));
		DecimalFormat cel = new DecimalFormat ("0.##");
		System.out.println(fahrenheit + " degrees Fahrenheit is " + cel.format(celsius) + " degrees Celsius.");


		System.out.print("Enter degrees in Celsius: ");
		celsius = scan.nextDouble();
		fahrenheit = (((9.0/5) * celsius) + 32);
		DecimalFormat fah = new DecimalFormat ("0.##");
		System.out.println(celsius + " degrees Celsius is " + fah.format(fahrenheit) + " degrees Fahrenheit.");

	}

}
