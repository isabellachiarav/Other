import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		
		final int COVERAGE = 350, doors = 20, windows = 15; //paint covers 350 sq ft/gal
		//declare integers length, width, and height;
		int length, width, height;
		//declare double totalSqFt;
		//declare double paintNeeded;
		double totalSqFt, paintNeeded;
		
		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);
		
		//Prompt for and read in the length of the room
		System.out.print("Enter the length of the room: ");
		length = scan.nextInt();
		
		//Prompt for and read in the width of the room
		System.out.print("Enter the width of the room: ");
		width = scan.nextInt();
		
		//Prompt for and read in the height of the room
		System.out.print("Enter the height of the room: ");
		height = scan.nextInt();
		
		System.out.print("Enter the number of doors: ");
		int doorsQuantity = scan.nextInt();
		System.out.print("Enter the number of windows: ");
		int windowsQuantity = scan.nextInt();
		
		//Compute the total square feet to be painted – think
		//about the dimensions of each wall
		totalSqFt = (2 * height * length) + (2 * height * width);
		totalSqFt = totalSqFt - ((doorsQuantity * doors) + (windowsQuantity * windows));

		//Compute the amount of paint needed
		paintNeeded = totalSqFt / 350;

		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Gallons of paint needed: " + paintNeeded);

	}

}
