package pigLatin;

public class PigLatinConverter {

	String input;

	public PigLatinConverter(String input) {
		this.input = input;
	}

	String replace() {

		if(input.substring(0) == "a" || input.substring(0) == "e" || input.substring(0) == "i" ||
				input.substring(0) == "o" || input.substring(0) == "u") {
			try {
				input = input.substring(0, 1) + "" + input.substring(2, input.length()) + input.substring(0) + "way"; 
			} catch (Exception e) {
				System.out.println("error");
			}

		} else {
			
			try {
				input = input.substring(0) + "" + input.substring(2, input.length()) + input.substring(0) + "ay"; 
			} catch (Exception e) {
				System.out.println("error");
			}

		}



		return replace();
	}

}
