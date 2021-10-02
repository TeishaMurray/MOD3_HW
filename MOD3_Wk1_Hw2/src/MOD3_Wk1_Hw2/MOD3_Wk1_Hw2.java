package MOD3_Wk1_Hw2;
import java.util.Scanner;
import java.lang.*;


public class MOD3_Wk1_Hw2 {

	public static void main(String[] args) {
//-----#1------
//		int startNum;
//		int endNum;
//		int nxtNum = 1;
//		int fibNum;
//		
		Scanner scan = new Scanner(System.in);
//			startNum = scan.nextInt();
//			endNum = scan.nextInt();
//			for(int i = 0; i<10; i++)
//			{
//				if(startNum <= endNum) {
//					System.out.println(startNum);
//				}
//				
//				fibNum = startNum + nxtNum;
//				startNum=nxtNum;
//				nxtNum=fibNum;
//				
//		}
			
	//-----#2-----
		//sum of cube of each digit in a number
		
//		int userNumber = scan.nextInt();
//		int maybeArmstrong = userNumber;
//		int sum = 0;
//		int remainder = 0;
//		
//		while(userNumber>0) {
//			remainder = userNumber % 10;
//			sum = sum + (remainder*remainder*remainder);
//			userNumber= userNumber / 10;
//				}
//			
//		if(maybeArmstrong == sum) {
//			System.out.println("Is Armstrong");
//		}
//		else {
//			System.out.println("Is Not Armstrong");
//		}
		
	//-----#3-----
		
		//palindrome - same forwards as backwards
		
		//so user enters a number
		int userNum = scan.nextInt();
		
		//convert this number to a string and store in new variable
		String userNumStr = Integer.toString(userNum);
//		System.out.println("userNum " + userNum);
//		System.out.println("userNumStr " + userNumStr);
		
		//reverse string
		StringBuffer toReverse = new StringBuffer(userNumStr);
//		System.out.println("String buffer = " + toReverse);
		
		StringBuffer reversed = toReverse.reverse();
//		System.out.println("Reversed = " + reversed);
		
		//convert
		String userNumStrB = reversed.toString();
//		System.out.println("Reversed to string " + userNumStrB);
		int userNumbB = Integer.parseInt(userNumStrB);
//		System.out.println("userNumB = " + userNumbB);
		
		if(userNum == userNumbB) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Is Not Palindrome");
		}
		
		//compare
		
		
		//convert back to int
		
		
		scan.close();
	}

}
