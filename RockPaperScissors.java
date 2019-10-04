import java.util.Scanner; 
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {


		String userChoice, computerChoice = null, another = "y";  
		int computerRandom, rounds = 1; 

		Scanner scan = new Scanner(System.in); 
		Random generator = new Random(); 

		while (another.equalsIgnoreCase("y")){
			System.out.println();
			System.out.println("Welcome to Rock, Paper, Scissors!");

			computerRandom = generator.nextInt(3);  

			if (computerRandom == 0) 
				computerChoice = "R"; 
			else if (computerRandom == 1) 
				computerChoice = "P"; 
			else if (computerRandom == 2) 
				computerChoice = "S"; 

			System.out.print("Enter 'R' for rock, 'P' for paper, or 'S' for scissors: "); 
			userChoice = scan.nextLine();

			if (userChoice.equalsIgnoreCase("rock")) {
				userChoice = "R";
			}
			else if (userChoice.equalsIgnoreCase("paper")) {
				userChoice = "P";
			}
			else if (userChoice.equalsIgnoreCase("scissors")) {
				userChoice = "S";
			}

			System.out.println("The computer's choice is: " + computerChoice);
			System.out.println("The user chose " + userChoice + " and the computer chose " + computerChoice + "." );


			while (userChoice.equalsIgnoreCase(computerChoice)) {
				System.out.println("It's a tie!"); 
				System.out.print("Choose again: ");
				computerRandom = generator.nextInt(3); 
				if (computerRandom == 0) 
					computerChoice = "R"; 
				else if (computerRandom == 1) 
					computerChoice = "P"; 
				else if (computerRandom == 2) 
					computerChoice = "S"; 
				userChoice = scan.nextLine();
				if (userChoice.equalsIgnoreCase("rock")) {
					userChoice = "R";
				}
				else if (userChoice.equalsIgnoreCase("paper")) {
					userChoice = "P";
				}
				else if (userChoice.equalsIgnoreCase("scissors")) {
					userChoice = "S";
				}

				System.out.println("The computer's choice is: " + computerChoice);
				System.out.println("The user chose " + userChoice + " and the computer chose " + computerChoice + "." );	
			}

			if (userChoice.equalsIgnoreCase("R")) {
				if (computerChoice.equalsIgnoreCase("S")) {
					System.out.println("Rock beats scissors. You win!");
					System.out.println("Rounds played: " + rounds);
				}
				else if (computerChoice.equalsIgnoreCase("P")) {
					System.out.println("Paper beats rock. You lose.");
					System.out.println("Rounds played: " + rounds);
				}
			}
			else if (userChoice.equalsIgnoreCase("P")) {
				if (computerChoice.equalsIgnoreCase("S")) {
					System.out.println("Scissors beats paper. You lose.");
					System.out.println("Rounds played: " + rounds);
				}
				else if (computerChoice.equalsIgnoreCase("R")) {
					System.out.println("Paper beats rock. You win!");
					System.out.println("Rounds played: " + rounds);
				}
			}
			else if (userChoice.equalsIgnoreCase("S")) {
				if (computerChoice.equalsIgnoreCase("P")) {
					System.out.println("Scissors beats paper. You win!");
					System.out.println("Rounds played: " + rounds);
				}
				else if (computerChoice.equalsIgnoreCase("R")) {
					System.out.println("Rock beats scissors. You lose.");
					System.out.println("Rounds played: " + rounds);
				}
			}
			else {
				System.out.println("Invalid input.");
			}
			
			System.out.println();
			System.out.print("Do you want to play again? (y/n): ");
			another = scan.nextLine();
			rounds++;
		}
		if (another.equalsIgnoreCase("n")) {
			System.out.println();
			System.out.println("Thanks for playing!");
		}

	}

}
