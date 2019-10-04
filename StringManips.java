import java.util.Scanner;

public class StringManips {

	public static void main(String[] args) {
		
		
		String phrase = new String ("This is a String test.");
		int phraseLength; // number of characters in the phrase String
		int middleIndex; // index of the middle character in the String
		String firstHalf; // first half of the phrase String
		String secondHalf; // second half of the phrase String
		String switchedPhrase; //a new phrase with original halves switched
		String middle3; 
		

		// compute the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;

		// get the substring for each half of the phrase
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);

		// concatenate the firstHalf at the end of the secondHalf
		switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = switchedPhrase.replace(' ','*');

		// print information about the phrase
		System.out.println();
		System.out.println ("Original phrase: " + phrase);
		System.out.println ("Length of the phrase: " + phraseLength +
		" characters");
		System.out.println ("Index of the middle: " + middleIndex);
		System.out.println ("Character at the middle index: " +
		phrase.charAt(middleIndex));
		System.out.println ("Switched phrase: " + switchedPhrase);
		System.out.println();

		// get the substring for the middle 3 characters of the phrase
		int middle1;
		int middle2;
		middle1 = (middleIndex - 1);
		middle2 = (middleIndex + 2);
		middle3 = phrase.substring(middle1, middle2);
		System.out.println("The middle 3 characters of the phrase are " + middle3);
		
		//User enters hometown
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your city: ");
		String city = scan.nextLine();
		String cityLower = city.toLowerCase();
		System.out.print("Enter your state: ");
		String state = scan.nextLine();
		String stateUpper = state.toUpperCase();
		System.out.println("Your hometown is " + stateUpper + cityLower + stateUpper );

	}

}
