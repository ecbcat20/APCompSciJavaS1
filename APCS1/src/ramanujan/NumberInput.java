package ramanujan;

import java.util.Scanner;

public class NumberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		CheckForCubeOne numberIn = new CheckForCubeOne(CheckForCubeOne.number1, CheckForCubeOne.number2);
		
	}

}
