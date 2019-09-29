package pigLatin;

public class PigLatinConverter {

	String input;

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

		String finalPigLatin = input.substring(index)  //return final result
				+ input.substring(0, index) + "ay"; 

		return finalPigLatin;
	}





} 







