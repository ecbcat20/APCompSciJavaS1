package pigLatin;

import java.util.Scanner;

public class PigLatinMain {
	
	

	@SuppressWarnings("static-access")
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		
	
		
		do {
			System.out.println("Enter string to convert to Pig Latin: ");
			input = scanner.next();
			
			@SuppressWarnings("unused")
			PigLatinConverter pig = new PigLatinConverter(input);
			String s = PigLatinConverter.pigLatin(input);
			System.out.println(s);
		
			PigLatinReversal d = new PigLatinReversal(s);
			d.reversed();
			
			System.out.println(d);
			
		} while(!input.equals("quit"));

		scanner.close();
	}

}
