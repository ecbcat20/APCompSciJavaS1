package betterPigLatin;

import java.util.Scanner;

public class BetterPigLatin {

	static String input;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Welcome to the Pig Latin Converter.");
		System.out.println("Input your String: ");
		input = scanner.next();
		System.out.println(input);
		scanner.close();

		Converter finalString = new Converter(input);

		if(input.indexOf("A") == 0 || input.indexOf("A") == 0 ||input.indexOf("A") == 0 
				|| input.indexOf("A") == 0 ||input.indexOf("B") == 0 ||
				input.indexOf("C") == 0 ||input.indexOf("D") == 0 ||input.indexOf("E") == 0 ||
				input.indexOf("F") == 0 ||input.indexOf("G") == 0 ||input.indexOf("H") == 0 ||
				input.indexOf("I") == 0 ||input.indexOf("J") == 0 ||input.indexOf("K") == 0 ||
				input.indexOf("L") == 0 ||input.indexOf("M") == 0 ||input.indexOf("N") == 0 ||
				input.indexOf("O") == 0 ||input.indexOf("P") == 0 ||input.indexOf("Q") == 0 ||
				input.indexOf("R") == 0 ||input.indexOf("S") == 0 ||input.indexOf("T") == 0 ||
				input.indexOf("U") == 0 ||input.indexOf("V") == 0 ||input.indexOf("W") == 0 ||
				input.indexOf("X") == 0 || input.indexOf("Y") == 0 ||input.indexOf("Z") == 0) {

			finalString.returnIfCapital();

		}

		if(input.contains("q") && input.indexOf("u") == input.indexOf("q")+1) {
			finalString.returnIfQ();
			System.out.println(Converter.q);
		}

		if(input.contains("?") || input.contains("!") || input.contains("\"")) {

			if(input.contains("?")) {
				finalString.returnIfPunctuated();

			} else if(input.contains("!")) {
				finalString.returnIfPunctuated();
				
			} else if(input.contains("\"")) {
				finalString.returnIfQuoted();

			} else {
				System.out.println("Invalid: Try Again");
			}
		}
		
		

		if(input.indexOf("A") == 0 || input.indexOf("A") == 0 ||input.indexOf("A") == 0 
				|| input.indexOf("A") == 0 ||input.indexOf("B") == 0 ||
				input.indexOf("C") == 0 ||input.indexOf("D") == 0 ||input.indexOf("E") == 0 ||
				input.indexOf("F") == 0 ||input.indexOf("G") == 0 ||input.indexOf("H") == 0 ||
				input.indexOf("I") == 0 ||input.indexOf("J") == 0 ||input.indexOf("K") == 0 ||
				input.indexOf("L") == 0 ||input.indexOf("M") == 0 ||input.indexOf("N") == 0 ||
				input.indexOf("O") == 0 ||input.indexOf("P") == 0 ||input.indexOf("Q") == 0 ||
				input.indexOf("R") == 0 ||input.indexOf("S") == 0 ||input.indexOf("T") == 0 ||
				input.indexOf("U") == 0 ||input.indexOf("V") == 0 ||input.indexOf("W") == 0 ||
				input.indexOf("X") == 0 || input.indexOf("Y") == 0 ||input.indexOf("Z") == 0 && input.contains("!")) {
			
		}
	}	

}
