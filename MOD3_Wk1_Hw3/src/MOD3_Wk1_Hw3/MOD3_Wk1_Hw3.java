package MOD3_Wk1_Hw3;
import java.util.Scanner;
 
public class MOD3_Wk1_Hw3 {
			
		
		static void doMath() {
			
			double userInput1;
			double userInput2;
			String operation; 
		
		Scanner scan = new Scanner(System.in);

			System.out.println("Type '+' to add, '-' to subtract, '*' to multiply or '/' to divide. Then hit Enter."); 
			System.out.println("Next type your first number, then hit Enter.");
			System.out.println("Finally, type your second number, then hit Enter");
			
			operation = scan.nextLine();
			userInput1 = scan.nextDouble();
			userInput2 = scan.nextDouble();
					
			switch(operation) {
			case "+":
				if((userInput1 >=1 && userInput1 <=5) && (userInput2 >=1 && userInput2 <=5)){
					System.out.println(userInput1 + userInput2);
				}
				else {
					System.out.println("Invalid Entry, Try Again.");
				}
				break;
			case "-":
				if((userInput1 >=1 && userInput1 <=5) && (userInput2 >=1 && userInput2 <=5)){
					System.out.println(userInput1 - userInput2);
				}
				else {
					System.out.println("Invalid Entry, Try Again.");
				}
				break;
			case "*":
				if((userInput1 >=1 && userInput1 <=5) && (userInput2 >=1 && userInput2 <=5)){
					System.out.println(userInput1 * userInput2);
				}
				else {
					System.out.println("Invalid Entry, Try Again.");
				}
				break;
			case "/":
				if((userInput1 >=1 && userInput1 <=5) && (userInput2 >=1 && userInput2 <=5)){
					System.out.println(userInput1 / userInput2);
				}
				else {
					System.out.println("Invalid Entry, Try Again.");
				}
				break;
			default:
				System.out.println("Something went wrong, please try again.");
				break;
			}
			
		scan.close();
		}

	public static void main(String[] args) {
		doMath();
		
				
		
	}
	
	
}
