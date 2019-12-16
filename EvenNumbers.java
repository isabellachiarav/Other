package ch6;

public class EvenNumbers {

	public static void main(String[] args) {
		
		int value = 2;
		int sum = 0;
		while (value <= 100) {
			if (value % 2 == 0) {
				sum = sum + value;
			}
			value++;
		}
		System.out.println("The sum of all even numbers between 2 and 100 is " + sum + ".");
 
	}

}
