
public class TimeDilation {

	public static void main(String[] args) {
		
		
		double tv, v;
		final double t0 = 100, c = 299792458;
		System.out.println("v\t\t\ttv");
		v = .01 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .1 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .5 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .9 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .95 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t" + tv);
		v = .99 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .999 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t\t" + tv);
		v = .9999 * c;
		tv = ((t0) / (Math.sqrt((1) - ((Math.pow(v,2)/(Math.pow(c,2)))))));
		System.out.println(v + "\t" + tv);
	}

}
