import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		int n, temp;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your array size: ");
		n = scan.nextInt();


		int[] userArray = new int[n];

		for(int i = 0; i< userArray.length; i++){
			System.out.print("Enter number " + (i + 1) + " in your array: ");
			userArray[i] = scan.nextInt();
		}
	
		System.out.print("Original Array: ");
		for(int i = 0; i< userArray.length; i++){
			System.out.print(userArray[i] + " ");
		}
		
		
		for(int i = 0; i<(userArray.length / 2); i++){
			temp = userArray[i];
	        userArray[i] = userArray[userArray.length - i - 1];
	        userArray[userArray.length - i - 1] = temp;
		}
		
		System.out.println();
		System.out.print("Reversed Array: ");
		for(int i = 0; i< userArray.length; i++){
			System.out.print(userArray[i] + " ");
		}
	}


}
