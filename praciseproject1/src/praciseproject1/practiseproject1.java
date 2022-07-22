package praciseproject1;

public class practiseproject1 {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int i=a;
		System.out.println("Value of i: "+i);
		
		float j=a;
		System.out.println("Value of j: "+j);
		
		long k=a;
		System.out.println("Value of k: "+k);
		
		double s=a;
		System.out.println("Value of s: "+s);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}



