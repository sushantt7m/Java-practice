package inputoutput;
import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
//		Take number input
		Scanner inputScan = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int number = inputScan.nextInt();
		System.out.println("You entered " + number);

	
//		Take string input

		System.out.print("Enter Desired string : ");
		String text = inputScan.next(); 
		System.out.println("You entered : " + text);
		inputScan.close();
	}	
}
