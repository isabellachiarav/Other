import java.text.NumberFormat;

public class BookInventoryDriver {

	public static void main(String[] args) {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		BookInventory book1 = new BookInventory("Jane Eyre", 8.99, 500, 3, 5, 3.7);
		BookInventory book2 = new BookInventory("Grendel", 4.99, 100, 3, 7, 4.5);
		BookInventory book3 = new BookInventory("Frankenstein", 7.99, 250);
		
		book1.addInventory(2);
		book2.sellInventory(2);
		book3.updateRating(3.5);
		
		book3.changeBookTitle("Wuthering Heights");
		book2.changeNumPages(150);
		book1.changePrice(7.99);
		
		System.out.println(book1);
		
		System.out.println(book1.getNumCopies());
		System.out.println(book2.getNumCopies());
		System.out.println(book3.getAvgRating());
		
		System.out.println(book3.getBookTitle());
		System.out.println(book2.getNumPages());
		System.out.println(fmt.format(book1.getPrice()));

	}

}
