
public class TempConvert {

	public static void main(String[] args) {
		
		double fahrenheit = 70, celsius;
		celsius = ((fahrenheit - 32) * (5.0 / 9));
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
		
		celsius = 20;
		fahrenheit = (((9.0/5) * celsius) + 32);
		System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
	}

}
