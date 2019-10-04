import java.util.Random;

public class RandomInt {

	public static void main(String[] args) {
		
		
		Random generator = new Random();
		System.out.println(generator.nextInt(21)); //a 0 to 20
		System.out.println(generator.nextInt(20) + 1); //b 1 to 20
		System.out.println(generator.nextInt(91) + 10); //c 10 to 100
		System.out.println(generator.nextInt(11) - 3); //d -3 to 7

	}

}
