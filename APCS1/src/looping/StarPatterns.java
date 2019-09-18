package looping;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("Enter your odd number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();


		for (int i=1; i<=number; i++) {
			for (int j=1; j<i; j++) { 
				
				System.out.print("*");
				
				for(int l = number; l<=number; l--) {
					System.out.print("");
				}
				
			} 
			
			for (int k=number; k>=i; k--)
			{
				System.out.print("*");
			}
			
			System.out.println("");



		}
		
		
		scanner.close();
		
	}

}
