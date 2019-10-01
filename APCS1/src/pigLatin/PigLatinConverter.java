package pigLatin;

public class PigLatinConverter {

	static String input, finalPigLatin; //initialize String variables, add static modifiers to match. 

	@SuppressWarnings("static-access") //no more static access warnings. 
	public PigLatinConverter(String input) {
		this.input = input;
	}

	//determine if is vowel. 
	static boolean isVowel(char c) { 
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c =='y' || 
				c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || c =='Y';
	} //list of values
	
	static boolean characters(char e) {
		return (e == '!' || e == '?' || e == '.') || e == ',';
	} //list of vowels
	
	static char[] characters = {'!', '.', '.', '?'};


	//main conversion method. 
	static String pigLatin(String input) {
		int length = input.length(); //set length of String
		int index = -1; //set index of first vowel to -1


		//go through the String and search for vowels. Set first vowel index to i once a vowel is found. 
		for(int i = 0; i < length; i++) {
			if(isVowel(input.charAt(i))) { //check for vowels at index i 
				index = i; //once vowels are found, set vowel index at i
				break;
			}
		}
		

		if(index == -1) //if vowels are at beginning of string, set to -1
			return "-1";

		if(index == -1) //if vowels are at beginning of string, set to -1
			return "-1";


		//take what you got and capitalize the first letter
		//only run if the thing you put in features a capital letter at the beginning. 
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
					finalPigLatin.substring(1).toLowerCase(); //make string

			return finalPigLatin; //return string if capital letter


			//run if the input is a q and u case. Otherwise run the other methods.
		} else if(input.contains("q") && input.indexOf("u") == input.indexOf("q")+1) {

			finalPigLatin = input.substring(index+1)
					+ input.substring(0, index) + "uay"; //return final result


			return finalPigLatin; //return string if qu word.

		} else if(input.indexOf("y") == 0) {
			
			finalPigLatin = input.substring(index+1)
					+ input.substring(0, index) + "yay"; //return string if normal word. 

		} else if(index == 0) {
			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + "way"; 
			
		} else if(input.contains("?")) {
			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + input.substring(input.length()) + "ay" + "?"; 
			
		

		} else {

			finalPigLatin = input.substring(index)
					+ input.substring(0, index) + "ay"; //return string if normal word. 
		}

		return finalPigLatin; //return string if normal word. 

	}



} //stuck on punctuation, and quotations
