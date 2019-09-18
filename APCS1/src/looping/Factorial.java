package looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		//factorial is for example, 5*4*3*2*1
		//only have to multiply by second to last number, not 1
		
		int i, factorial = 1; //initialize i and factorial
		Scanner scanner = new Scanner(System.in); //initialize Scanner
		
		System.out.println("Enter number to factorialize"); //get user input
		int number = scanner.nextInt(); //factorialized number different from factorial
		
		for(i = 1; i <=number; i++) { // for(i = 1, i is less than number to factorialize, increase i)
			factorial = factorial * i; // factorial = i * factorial because i decreases each count
		}
		
		System.out.println(factorial); //print result
		
		scanner.close(); //close scanner
		
		
	}

}
