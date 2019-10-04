import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3Labs {

	public static void main(String[] args) {



		//		double currentSalary, rating, raise = 0;  
		//		Scanner scan = new Scanner(System.in);
		//		System.out.print ("Enter your current salary: ");
		//		currentSalary = scan.nextDouble();
		//		System.out.print ("Enter your performance rating: ");
		//		rating = scan.nextDouble();
		//		System.out.println("Original Salary: " + currentSalary);
		//		if (rating == 1) {
		//			raise = 6;
		//			System.out.println("Raise percentage: " + raise + "%");
		//			raise = 0.06;
		//			raise = (currentSalary * raise);
		//		}
		//		else if (rating == 2) {
		//			raise = 3;
		//			System.out.println("Raise percentage: " + raise + "%");
		//			raise = 0.03;
		//			raise = (currentSalary * raise);
		//		}
		//		else if (rating == 3) {
		//			raise = 1;
		//			System.out.println("Raise percentage: " + raise + "%");
		//			raise = 0.01;
		//			raise = (currentSalary * raise);
		//		}
		//		else {
		//			System.out.println("Invalid rating.");
		//		}
		//		System.out.println ("Amount of your raise: $" + raise);
		//		System.out.println ("Your new salary: $" + (currentSalary + raise));



		//		double point1, point2;
		//		Scanner scan = new Scanner(System.in);
		//		System.out.print("Input the x and y values of the coordinate: ");
		//		point1 = scan.nextDouble();
		//		point2 = scan.nextDouble();
		//		if (point1 > 0 && point2 > 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies in the first quadrant.");
		//		}
		//		else if (point1 < 0 && point2 > 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies in the second quadrant.");
		//		}
		//		else if (point1 < 0 && point2 < 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies in the third quadrant.");
		//		}
		//		else if (point1 > 0 && point2 < 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies in the fourth quadrant.");
		//		}
		//		else if (point1 == 0 && point2 == 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies on the origin.");
		//		}
		//		else if (point1 == 0 && point2 != 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies on the x-axis.");
		//		}
		//		else if (point1 != 0 && point2 == 0) {
		//			System.out.println("The coordinate (" + point1 + ", " + point2 + ") lies on the y-axis.");
		//		}



		//		int count = 10;
		//		while (count > 0){
		//			System.out.println(count);
		//			count--;
		//		}



		//		int count = 0;
		//		while (count < 10) {
		//			System.out.println("MATES Class of 2019");
		//			count++;
		//		}
		//		for (int count = 0; count < 10; count++){
		//			System.out.println("MATES Class of 2019");
		//		}



		//		int num, count=0, sum = 0;
		//		Scanner scan = new Scanner (System.in);
		//		System.out.print("Enter an integer greater than 2 and press Enter. ");
		//		num = scan.nextInt();
		//		if (num >= 2){
		//			while  (count <= num){
		//				sum = sum + count;
		//				count += 2;
		//			}
		//			System.out.println("The sum of the even integers between 2 and your input is " + sum + ".");
		//		}
		//		else {
		//			System.out.println("Invalid input.");
		//		}



		//		String str;
		//		Scanner scan = new Scanner (System.in);
		//		System.out.print("Enter a string: ");
		//		str = scan.nextLine();
		//
		//		int length = str.length(), count = 0;
		//		while (count <= length){
		//			System.out.println(str.charAt(count));
		//			count++;
		//		}




//		double currentSalary, rating, raise = 0;  
//		Scanner scan = new Scanner(System.in);
//		System.out.print ("Enter your current salary: ");
//		currentSalary = scan.nextDouble();
//		System.out.print ("Enter your performance rating: ");
//		rating = scan.nextDouble();
//		for (int count = 0; count <= 30; count++){
//			if (rating == 1) {
//				raise = 0.06;
//				raise = (currentSalary * raise);
//				currentSalary += raise;
//			}
//			else if (rating == 2) {
//				raise = 0.03;
//				raise = (currentSalary * raise);
//				currentSalary += raise;
//			}
//			else if (rating == 3) {
//				raise = 0.01;
//				raise = (currentSalary * raise);
//				currentSalary += raise;
//			}
//			else {
//				System.out.println("Invalid rating.");
//			}
//		}
//		NumberFormat salary = NumberFormat.getCurrencyInstance();
//		System.out.println("In 30 years, your salary will be " + salary.format(currentSalary));
		
		
		
		String another = "y";
		int num = 0, count, sum = 0;
		Scanner scan = new Scanner(System.in);
		while (another.equalsIgnoreCase("y")){
			System.out.print("Enter a positive integer: ");
			num = scan.nextInt();

			for (count = 1 ; count < num ; count++) {
				if (num % count == 0) {
					sum = sum + count;
				}
			}
			if (sum == num) {
				System.out.println(num + " is a perfect number.");
			}
			else if (sum < num) {
				System.out.println(num + " is a deficient number.");
			}
			else {
				System.out.println(num + "is an abundant number.");
			}
			System.out.println();
			System.out.print("Do you want to test another number? (y/n)");
			another = scan.next();
		}
		
		
		
		
	}
}
		
