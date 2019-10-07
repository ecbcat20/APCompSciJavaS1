package pigLatin;

public class PigLatinReversal {
	String input;

	public PigLatinReversal(String input) {
		this.input = PigLatinConverter.input;
	}

	static String reversed = PigLatinConverter.finalPigLatin;
	static String [] revArray = reversed.split("(?!^)");
	static String z = reversed;

	static void reversed() {
		for(int i = reversed.length() - 1; i >= 0; i--) {
			z = z + z.charAt(i);
			System.out.println(z);
		}

		System.out.println("Reversed string is:");
		System.out.println(z);
	}

}



