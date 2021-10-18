public class typeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting:-");
		
		int a=50;
		System.out.println("Value of a:"+a);

		long b=a;
		System.out.println("Value of b:"+b);
		
		float c=b;
		System.out.println("Value of c:"+c);
		
	
		System.out.println("\n");
		System.out.println("Explicit type Casting");
		
		float x = 50;
		int y = (int)x;
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		
	}

}
