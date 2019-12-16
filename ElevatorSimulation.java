package ch5;

import java.util.Scanner;

public class ElevatorSimulation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		int floor = in.nextInt();
		
		int actualFloor;
		int thresholdFloor = 13;
		
		if (floor < thresholdFloor) {
			actualFloor = floor;
		}
		else {
			actualFloor = floor - 1;
		}
		
		System.out.println("The actual floor is " + actualFloor + ".");
		
	}

}
