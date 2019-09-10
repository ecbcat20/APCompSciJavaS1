package personalchallenges;

import java.util.Scanner;

public class calculatorChallenge {

	//static doubles bc need to be accessed by main method
	static double val1, val2;
	static char operation;
	static Scanner scanner = new Scanner(System.in);

	//i just don't want errors :)
	@SuppressWarnings("static-access")
	public calculatorChallenge(double val1, double val2) {
		this.val1 = val1; this.val2 = val2;
	}

	//main operation switch
	char operation() {
		switch(operation) {
		case '+': System.out.println("Answer: " + val1 + val2);
		break;

		case '-': System.out.println("Answer: " + val1 + (-val2));
		break;

		case '*': System.out.println("Answer: " + val1 * val2);
		break;

		case '/': System.out.println("Answer: " + val1 / val2);
		break;

		} return operation;
	}

	//main method
	public static void main(String[] args) {

		//instantiate calculation as calculatorChallenge
		calculatorChallenge calculation = new calculatorChallenge(val1, val2);

		//get user input for val1;
		System.out.println("Welcome to the java calculator. Please enter your first number: ");
		val1 = scanner.nextInt();

		//get user input for val2;
		System.out.println("Entered: " + val1 + " Please enter your second value: ");
		val2 = scanner.nextInt();

		//read out what user has input
		System.out.println("Your 2 numbers are: " + val1 + " & " + val2);
		System.out.println("Please enter your operation (+  -  *  / : ");
		operation = scanner.next().charAt(0);

		//perform indicated operation
		calculation.operation();




	}

}
