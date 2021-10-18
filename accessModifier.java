class defAccessModifier
{
	void display()
	{
		System.out.println("You are using Default Access Specifier.");
		
	}
}

class pubAccessModifier
{
	public void display()
	{
		System.out.println("You are using Public Access Specifier.");
	}
}

class proAccessModifier
{
	protected void display()
	{
		System.out.println("You are using Protected Access Specifier.");		
		
	}
}


public class accessModifier{

	public static void main(String[] args) {
		
		class priAccessModifier
		{
			private void display()
			{
				System.out.println("You are using Private Access Specifier.");		
				
			}
		}
		
		System.out.println("You are testing Access Modifier Methods :");
		defAccessModifier obj = new defAccessModifier();
		obj.display();
		
		pubAccessModifier objPub = new pubAccessModifier();
		objPub.display();
		
		proAccessModifier objPro = new proAccessModifier();
		objPro.display();
		
		priAccessModifier objPri = new priAccessModifier();
		objPri.display();
		
	}

}
