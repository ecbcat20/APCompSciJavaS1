package pigLatin;

import java.util.Scanner;

public class PigLatinMain {
	
	

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("Enter string to convert to Pig Latin: ");
			input = scanner.next();

			System.out.println(PigLatinConverter.pigLatin(input));
			
		} while(!input.equals("quit"));

		scanner.close();
	}

}
