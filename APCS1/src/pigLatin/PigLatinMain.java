package pigLatin;

import java.util.Scanner;

public class PigLatinMain {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to convert to Pig Latin: ");
		String input = scanner.next();
		
		System.out.println(PigLatinConverter.pigLatin(input));

		
		scanner.close();
	}

}
