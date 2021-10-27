package Package1;
import java.util.Scanner;

public class Circle {
	
	public double circumferenceOfCircle(int r)
	{
	 double c = 3.14*r*r;	
	 return c;
	}
	public double areaOfCircle(int r) //parameterized method
	{
	 double a = 2*3.14*r;
	 return a;
	}
	
	public static void main(String[] args) {
		Circle ob = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Radius :");
		int a = scan.nextInt();
		
		double c = ob.circumferenceOfCircle(a); //Call by Method
		System.out.println("Circumference is  :"+c);
		double A = ob.areaOfCircle(a);
		System.out.println("Circumference is  :"+A);				
	}
}
