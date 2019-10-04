import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {


		double t, v, w;

		//user enters temperature (Fahrenheit) and wind speed (miles per hour)
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		t = scan.nextDouble();
		System.out.print("Enter the wind speed in miles per hour: ");
		v = scan.nextDouble();

		//calculates wind chill from user input
		w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v,0.16));

		//prints value of wind chill
		System.out.println("The wind chill is " + w);




	}

}
