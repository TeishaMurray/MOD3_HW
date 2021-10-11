package OOP;
import java.util.Scanner;

public class Employee extends Person implements PersonInterface {

	int emplID;
	String dept;
	double audit1, audit2, audit3;
	double emplPerf = (audit1 + audit2 + audit3)/3;
	
	Employee(String first, String last, String email, int age, int id, String dept){
		
		super(first, last, email, age);
		
		this.emplID =  id;
		this.dept = dept;
		
	}
	
	public void eProfile() {
		System.out.println(emplID);
		super.pInfo();
			
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the following information:");
		System.out.println("First Name: ");
		scan.nextLine();
		System.out.println("Last Name: ");
		scan.nextLine();
		System.out.println("Email: ");
		scan.nextLine();
		System.out.println("Department: ");
		scan.nextInt();
		
		
		scan.close();
	}

}
