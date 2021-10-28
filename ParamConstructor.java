package Package1;

 class stdInfor{
	int id;
	String name;

	public stdInfor(int i, String n){
		 id=i;
		 name=n;
	 }
	 
	 void display() {
		 System.out.println(id+"-"+name);
	 }

}

public class ParamConstructor {

	public static void main(String[] args) {
		stdInfor std1 = new stdInfor(12,"Alex");
		stdInfor std2 = new stdInfor(14,"Jone");
		
		std1.display();
		std2.display();
	}

}
