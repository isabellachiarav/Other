import java.text.DecimalFormat;
import java.util.Scanner;


public class GradingQuizzes {

	public static void main(String[] args) {

		String another = "y";
		int rounds = 0;
		while (another.equalsIgnoreCase("y")){

			System.out.println();
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number of quiz questions: ");
			int numQuestions = scan.nextInt();
			int[] quizKey = new int[numQuestions];
			int[] quizAnswers = new int[numQuestions];
			double percentCorrect;
			double numCorrect = 0;
			for (int i = 0; i < quizKey.length; i++){
				System.out.print("Enter the correct answer to question " + (i + 1) + ": ");
				quizKey[i] = scan.nextInt();
			}
			for (int i = 0; i < quizAnswers.length; i++){
				System.out.print("Enter your answer to question " + (i + 1) + ": ");
				quizAnswers[i] = scan.nextInt();
			}
			for (int i = 0; i < quizKey.length; i++){
				if (quizKey[i] == quizAnswers[i]){
					numCorrect++;
				}
			}
			DecimalFormat df = new DecimalFormat(".##");
			System.out.println("Number of Questions Correct: " + numCorrect);
			percentCorrect = (numCorrect / quizKey.length) * 100;
			System.out.println("Percent Correct: " + (df.format(percentCorrect) + "%"));


			System.out.println();
			System.out.print("Grade another quiz? (y/n): ");
			another = scan.next();
			rounds++;
		}


	}	


}
