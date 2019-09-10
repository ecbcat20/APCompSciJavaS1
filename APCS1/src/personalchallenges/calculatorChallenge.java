package personalchallenges;

import java.util.Scanner;

public class calculatorChallenge {

	static double val1, val2;
	static String operation;
	static String operationToDo;
	static Scanner scanner = new Scanner(System.in);
	
	@SuppressWarnings("static-access")
	public calculatorChallenge(double val1, double val2) {
		this.val1 = val1; this.val2 = val2;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	String operation() {
		if(operationToDo.equals('+')) {
			System.out.println(val1 + val2);
		}
		
		if(operationToDo.equals('-')) {
			System.out.println(val1 + -val2);
		}
		
		if(operationToDo.equals('*')) {
			System.out.println(val1 * val2);
		}
		
		if(operationToDo.equals('/')) {
			System.out.println(val1/val2);
		} return operation;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculatorChallenge calculation = new calculatorChallenge(val1, val2);
		
		System.out.println("Welcome to the java calculator. Please enter your first number: ");
		val1 = scanner.nextInt();
		
		System.out.println("Entered: " + val1 + " Please enter your second value: ");
		val2 = scanner.nextInt();
		
		System.out.println("Your 2 numbers are: " + val1 + " & " + val2);
		System.out.println("Please enter your operation (+  -  *  / : ");
		String operationToDo = scanner.nextLine();
		
		System.out.println("Operation: " + val1 + " "  + operationToDo + " " + val2);
		calculation.operation();
				
		
		
		
	}

}
