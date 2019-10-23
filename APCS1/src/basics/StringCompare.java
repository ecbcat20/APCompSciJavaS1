package basics;

public class StringCompare {

	static String str = "Hello";
	static String str2 = "Hi";
	// -----------------------------\\
	static String h = "New";
	static String i = "MewString";

	// -----------------------------\\
	static String x = "Hello";
	static String y = "Hello World";

	// -----------------------------\\

	static String u = new String("BathTUB");
	static String w = new String("bathtub");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hello
		// Hi

		int two = h.compareTo(i);
		System.out.println(two);
		/*
		 * int num = h.compareTo(i); System.out.println(num);
		 */

	}

}
