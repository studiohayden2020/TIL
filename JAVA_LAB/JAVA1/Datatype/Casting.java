
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b);
		
		int c = (int)1.1;
		System.out.println(c);
		
		int d = (int)Math.ceil(Math.PI);
		System.out.println(d);
		
		double e = Math.E;
		System.out.println(e);
		System.out.println(e);
		
		String strl = Integer.toString(1);
		System.out.println(strl.getClass());	
		
		String test = Double.toString(3.12441);
		System.out.println(test);
		
		String test1 = Double.toString(Math.PI);
		System.out.println(test1);
		System.out.println(test1.getClass());
		
	}

}
