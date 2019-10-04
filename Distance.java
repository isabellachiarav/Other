import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2; // coordinates of two points
		double distance; // distance between the points
		Scanner scan = new Scanner(System.in);

		// Read in the two points
		System.out.print ("Enter the coordinates of the first point " +
				"(put a space between them): ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.print ("Enter the coordinates of the second point: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		//Find the distance between the two points
		double xSqrd, ySqrd;
		xSqrd = Math.pow(x2 - x1, 2);
		ySqrd = Math.pow(y2 - y1, 2);
		distance = Math.sqrt(xSqrd + ySqrd);
		System.out.println("The distance between the two points is " + distance);

		
		
	}

}
