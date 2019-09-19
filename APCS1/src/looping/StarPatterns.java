package looping;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("Enter your odd number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		

		for(int i = 0; i<=number; i++) { //master for loop, open

			for(int j = i; j>0; j--) { //i = j, j is greater than 0, decrement j
				System.out.print(" "); //will print spaces

			} //close second for loop

			System.out.println("*"); //print star

		} //close first for loop

		//----------------------------------------------------------------------------------

		for(int m = (number - 1); m>=0; m--) { //open new for loop that runs same amount of times

			for(int n = m; n>0; n--) {
				System.out.print(" ");
				for(int o = n; o<0; o++) {
					System.out.print("?");
				}
			}
			System.out.println("*");
		}
		System.out.println();

		scanner.close();


	}
}


