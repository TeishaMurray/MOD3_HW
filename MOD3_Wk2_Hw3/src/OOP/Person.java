package OOP;

public class Person {

	private String fname;
	private String lname;
	private String email;
	int age;
	
	
	public Person() {
		
	}
	
	public Person(String fname, String lname, String email, int age) {
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.age=age;
	}
	
	void pInfo() {
		System.out.println(fname + " " + lname);
		System.out.println("Age " + age);
	}
	
	
	public static void main(String[] args) {

		//testing create object
		
		Person p1 = new Person();
		p1.fname = "Teisha";
		p1.lname = "Murray";
		p1.email = "tmurrmurr@gmail.net";
		p1.age = 35;
		
		p1.pInfo();

		
	}

}
