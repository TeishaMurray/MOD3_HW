package OOP;
import java.util.Scanner;

public class Student extends Person implements PersonInterface{
	
	int studentID;
	double gpa;
	int count;
	
	public Student() {
		count++;
		
	}
	

	Student(String first, String last, String email, int age, int id, double gpa){
		
		super(first, last, email, age);
		
		this.studentID = id;
		this.gpa = gpa;		
		
		count++; 
		
	}

	public void sProfile() {
		System.out.println("ID: " + this.studentID);
		super.pInfo();
		System.out.println("GPA : " + gpa);
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
		System.out.println("Age: ");
		scan.nextInt();
		System.out.println("GPA: ");
		scan.nextDouble();
		
//		sProfile();
		
		scan.close();
	}

}
