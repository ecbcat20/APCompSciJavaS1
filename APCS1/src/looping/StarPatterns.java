package looping;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("Enter your odd number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();


		for (int i=0; i<=number; i++) {
			for(int j = number; j<=0; j--) { //print spaces

				System.out.print("*");
			

			}
			
			System.out.print("*");
			System.out.println();


			scanner.close();

		}

	}
}
