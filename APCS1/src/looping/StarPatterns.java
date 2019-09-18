package looping;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("Enter your odd number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();


		for (int i=1; i<=number; i++) {
			System.out.print("*");
			for(int space = 0; space<=number; space++) {

				System.out.print(".");

			}
			System.out.print("*");
			System.out.println();


			scanner.close();

		}

	}
}
