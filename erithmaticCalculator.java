class addition
{
	protected void add(){ //final not allow to do changes
	int p,q=50,r=10;
	p =q+r;
	float P=p; //Implicit type casting
	System.out.println("Addition is :" +P);
	}
}

class subtraction
{
	void sub() {
	float p,q,r;
	q=50;
	r=10;
	p =q-r;
	int P=(int)p;//Explicit type casting
	System.out.println("Subtraction is: "+P);
	}
}
class multiplication
{
	public void mul() {
	long p,q,r;
	q=50;
	r=10;
	p =q*r;
	System.out.println("Multiplication is: "+p);
	}
}


public class erithmaticCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Arithmatic Calculartor:-");
		
		class division
		{
			private void div() {
			final int p,q,r;
			q=50;
			r=10;
			p =q/r;
			System.out.println("Division is: "+p);
			}
		}

	    addition obj=new addition(); //protected access modifier
	    obj.add();
	    
	    subtraction	obj1=new subtraction()	; //default access modifier
	    obj1.sub();
	    
	    multiplication obj2=new multiplication();
	    obj2.mul();
	    
	    division obj3=new division();
	    obj3.div();
		
	}

}
