package Package1;

class stdInfo{
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Constructor {
	
	public static void main(String[] args) {
		stdInfo std1 = new stdInfo();
		stdInfo std2 = new stdInfo();
		
		std1.display();
		std2.display();
		
	}

}
