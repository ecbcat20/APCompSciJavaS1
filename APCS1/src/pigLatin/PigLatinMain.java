package pigLatin;

import java.util.Scanner;

public class PigLatinMain {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to convert to Pig Latin: ");
		String input = scanner.next();
		
		PigLatinConverter convert = new PigLatinConverter(input);
		convert.replace();
		System.out.println(input);
	}

}
