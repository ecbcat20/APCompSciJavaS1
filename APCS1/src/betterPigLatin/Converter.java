package betterPigLatin;

public class Converter {

	String input;
	String normal;
	String capital;
	static String q;
	String punctuated;
	String quoted;
	String capandpunc;
	String reversed;

	int index;

	public Converter(String input) {
		this.input = input;
	}

	boolean isVowel(char c) {
		return (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i'
				|| c == 'O' || c == 'o' || c == 'U' || c == 'u');
	}

	int inOfVowel() {

		for(int i = 1; i < input.length(); i++) {
			if(isVowel(input.charAt(i))) {
				index = i;
				break;
			}
		}

		if(index == -1) {
			return -1;
		}


		return index;
	}

	String returnIfNormal() {
		normal = input.substring(index, input.length()) + input.substring(0, index) + "ay"; 
		return normal;
	}

	String returnIfCapital() {
		capital = input.substring(index, input.length()) + input.substring(0, index) + "ay"; 
		capital = capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase(); //make string
		return capital;
	}

	String returnIfQ() {
		q = input.substring(index+1)+ input.substring(0, index) + "uay"; //return final result
		return q;
	}

	String returnIfPunctuated() {
		if(input.contains("!")) {
			punctuated = input.substring(index, input.length()-1) + input.substring(0, index)+ "ay" + "!";
		}

		if(input.contains("?")) {
			punctuated = input.substring(index, input.length()-1) + input.substring(0, index)+ "ay" + "?";
		}

		return punctuated;
	}

	String returnIfQuoted() {
		quoted = "\""+ input.substring(index, input.length()-1) + input.substring(1, index)+ "ay" + "\"";
		return quoted;
	}

	String returnIfCapandPunctuated() {
		//sample input = "Hello!"


		capandpunc = "\"" + input.substring(index) + input.substring(0,index) + "ay";
		capandpunc = capandpunc.substring(0,1).toUpperCase() + capandpunc.substring(1).toLowerCase();

		return capandpunc;
	}

	String returnIfReversed() {
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
