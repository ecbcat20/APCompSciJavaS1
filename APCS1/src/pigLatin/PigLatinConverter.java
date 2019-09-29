package pigLatin;

public class PigLatinConverter {

	static String input, finalPigLatin;

	@SuppressWarnings("static-access")
	public PigLatinConverter(String input) {
		this.input = input;
	}

	static boolean isVowel(char c) { 
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
				c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	} //list of values

	static String pigLatin(String input) {
		int length = input.length(); //set length of String
		int index = -1; //set index of first vowel to -1

		for(int i = 0; i < length; i++) {
			if(isVowel(input.charAt(i))) { //check for vowels at index i 
				index = i; //once vowels are found, set vowel index at i
				break;
			}
		}

		if(index == -1) //if vowels are at beginning of string, set to -1
			return "-1";

		//need to find the character at location 0 after conversion and change case;

		input.substring(0).toUpperCase();



		//take what you got and capitalize the first letter
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

			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + "ay"; //return final result

			finalPigLatin = finalPigLatin.substring(0,1).toUpperCase() + 
					finalPigLatin.substring(1).toLowerCase();

			return finalPigLatin;


		} else if(input.indexOf("q") == 0 && input.indexOf("u") == 1 || 
				input.indexOf("y") == 0) {
			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + "ay"; //return final result


			return finalPigLatin;
			
		} else {
			
			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + "ay"; //return final result
		}

		//at this point finalPigLatin is properly capitalized.

		
		return finalPigLatin;
	}
}












