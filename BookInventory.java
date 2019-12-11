import java.text.NumberFormat;
import java.util.Scanner;


public class BookInventory {
	
	//declare instance data
	private String bookTitle;
	private double price;
	private int numPages;
	private int numCopies;
	private int numRatings;
	private double avgRating;
	
	//constructor
	public BookInventory(String bT, double p, int nP, int nC, int nR, double aR){
		bookTitle = bT;
		price = p;
		numPages = nP;
		numCopies = nC;
		numRatings = nR;
		avgRating = aR;
	}
	
	//constructor
		public BookInventory(String bT, double p, int nP){
			bookTitle = bT;
			price = p;
			numPages = nP;
			numCopies = 0;
			numRatings = 0;
			avgRating = 0;
		}
		
	//method
		public void addInventory(int addCopies){
			numCopies += addCopies;
		}

	//method
		public void sellInventory(int sellCopies){
			numCopies -= sellCopies;
		}
		
	//method
		public void updateRating(double newRating){
			numRatings++;
			avgRating = (((numRatings-1) * avgRating)+ newRating)/numRatings;
		}
		
	//accessor
		public String getBookTitle(){
			return bookTitle;
		}
		
	//accessor
		public double getPrice(){
			return price;
		}
		
	//accessor
		public double getNumCopies(){
			return numCopies;
		}
		
	//accessor
		public double getAvgRating(){
			return avgRating;
		}
		
	//accessor
		public double getNumPages(){
			return numPages;
		}
		
	//mutator
		public void changeBookTitle(String newTitle){
			bookTitle = newTitle;
		}
		
	//mutator
		public void changeNumPages(int newNumPages){
			numPages = newNumPages;
		}
		
	//mutator
		public void changePrice(double newPrice){
			if ((newPrice >= 1.25 * price) || (newPrice <= .75 * price)){
				System.out.println("Warning! The price has changed more than 25%.");
				price = newPrice;
			}
			else{
				price = newPrice;
			}
		}
		
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
	//toString
		public String toString (){
		   return ("Book Title: " + bookTitle + "\t" + "Price: " + fmt.format(price) + "\t" + "Pages: " + numPages + "\t" 
				  + "Copies: " + numCopies + "\t" + "Number of Ratings: " + numRatings +  "\t" 
				  + "Average Rating: " + avgRating);
		}
		
}
