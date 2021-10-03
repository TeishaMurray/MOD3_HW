package MOD3_Wk1_Hw3;
import java.util.Scanner;
 
public class MOD3_Wk1_Hw3 {
			
		
		static void doMath() {
			
			double userInput1;
			double userInput2;
			String operation; 
		
		Scanner scan = new Scanner(System.in);

			System.out.println("Type '+' to add, '-' to subtract, '*' to multiply or '/' to divide."); 
			System.out.println("Type your first number.");
			System.out.println("Then type your second number");
			
			operation = scan.nextLine();
			userInput1 = scan.nextDouble();
			userInput2 = scan.nextDouble();
					
			switch(operation) {
			case "+":
				System.out.println(userInput1 + userInput2);
				break;
			case "-":
				System.out.println(userInput1 - userInput2);
				break;
			case "*":
				System.out.println(userInput1 * userInput2);
				break;
			case "/":
				System.out.println(userInput1 / userInput2);
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
