package looping;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("Enter your odd number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		

		//may have to implement a while loop to finish

		/* on first line while x is equal to i, print i spaces
		 * after i spaces is printed, print one *
		 */

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j < i; j++) { //prints space before each row
				System.out.print(" ");
			}

			for (int j = i; j <= number; j++) { 
				System.out.print("+" + " "); //prints symbol and then space
			} 

			System.out.println(); 
		} 

		//----------------------------------------------------------------------------------

		for (int i = number-1; i >= 1; i--) {
			//Printing i spaces at the beginning of each row

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			//Printing i to rows value at the end of each row

			for (int j = i; j <= number; j++) {
				System.out.print("+" + " ");
			}

			System.out.println();
		}


		scanner.close();


	}
}


