
public class StringPlay {

	public static void main(String[] args) {
		
		String college = new String("PoDunk College"); 
		String town = new String("Anytown, USA");  
		int stringLength = college.length(); 
		String change1, change2, change3; 
		System.out.println(stringLength);
		System.out.println(college + " contains " + stringLength + " characters."); ; 
		change1 = college.toUpperCase(); 
		System.out.println(change1);
		change2 = change1.replace('O','*');
		System.out.println(change2);
		change3 = college.concat(" " + town);
		System.out.println(change3);

	}

}
