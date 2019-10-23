package stringBasics;

public class StringAssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print name
		System.out.println("Shy");

		// 2 instances of String
		String a = "Hello World";
		String b = new String("Hello World");

		// print strings
		System.out.println(a + " " + b);

		// set default string to value and print
		String c;
		c = "Hello, World";
		System.out.println(c);

		// print a blank line
		System.out.println("Hello");
		System.out.println("\n" + " world");

		// print 3rd character in string
		System.out.println(a.charAt(3));
		System.out.println(b.charAt(3));

		// blank line
		System.out.println("\n");

		// to upper case
		a = a.toUpperCase();

		// print new value
		System.out.println(a);

		// concatenate
		String s = new String("Kidd");
		s.concat(s);

		// blank line
		System.out.println("\n");

		// compareTo
		String o = "l";
		String v = "b";
		o.compareTo(v);
		v.compareTo(o);

		// blank line
		System.out.println("\n");

		// equals method
		String x, y;
		x = "i";
		y = "u";
		if (x.contentEquals(y)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// blank line
		System.out.println("\n");

		// set both strings to same value
		x = y;
		x.compareTo(y);

	}

}
